package com.tonikelope.megabasterd;

import java.awt.Color;
import java.awt.Desktop;
import java.io.File;
import java.io.IOException;
import static java.lang.Integer.MAX_VALUE;
import java.util.concurrent.Callable;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JProgressBar;
import javax.swing.JSpinner;
import javax.swing.SpinnerNumberModel;
import static com.tonikelope.megabasterd.MiscTools.*;
import static com.tonikelope.megabasterd.MainPanel.*;

/**
 *
 * @author tonikelope
 */
public final class DownloadView extends javax.swing.JPanel implements TransferenceView {

    private final Download _download;

    public JButton getClose_button() {
        return close_button;
    }

    public JButton getCopy_link_button() {
        return copy_link_button;
    }

    public JButton getOpen_folder_button() {
        return open_folder_button;
    }

    public JLabel getFile_name_label() {
        return file_name_label;
    }

    public JLabel getFile_size_label() {
        return file_size_label;
    }

    public JCheckBox getKeep_temp_checkbox() {
        return keep_temp_checkbox;
    }

    public JButton getPause_button() {
        return pause_button;
    }

    public JProgressBar getProgress_pbar() {
        return progress_pbar;
    }

    public JButton getRestart_button() {
        return restart_button;
    }

    public JLabel getSlot_status_label() {
        return slot_status_label;
    }

    public JLabel getSlots_label() {
        return slots_label;
    }

    public JSpinner getSlots_spinner() {
        return slots_spinner;
    }

    public JLabel getSpeed_label() {
        return speed_label;
    }

    public JLabel getStatus_label() {
        return status_label;
    }

    public JButton getStop_button() {
        return stop_button;
    }

    public DownloadView(Download download) {

        initComponents();

        updateFonts(this, DEFAULT_FONT, download.getMain_panel().getZoom_factor());

        _download = download;

        slots_spinner.setModel(new SpinnerNumberModel(_download.getMain_panel().getDefault_slots_down(), Download.MIN_WORKERS, Download.MAX_WORKERS, 1));

        ((JSpinner.DefaultEditor) slots_spinner.getEditor()).getTextField().setEditable(false);

        speed_label.setForeground(new Color(0, 128, 255));
        progress_pbar.setMinimum(0);
        progress_pbar.setMaximum(MAX_VALUE);
        progress_pbar.setStringPainted(true);

        status_label.setText("");

        for (JComponent c : new JComponent[]{slots_spinner, slots_label, pause_button, stop_button, speed_label, progress_pbar, keep_temp_checkbox, file_name_label, close_button, copy_link_button, restart_button, file_size_label, open_folder_button}) {

            c.setVisible(false);
        }

    }

    public void hideAllExceptStatus() {

        swingInvoke(
                new Runnable() {
            @Override
            public void run() {

                for (JComponent c : new JComponent[]{speed_label, slots_spinner, slots_label, slot_status_label, slot_status_label, pause_button, stop_button, progress_pbar, keep_temp_checkbox}) {

                    c.setVisible(false);
                }
            }
        });
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        status_label = new javax.swing.JLabel();
        slots_label = new javax.swing.JLabel();
        slots_spinner = new javax.swing.JSpinner();
        speed_label = new javax.swing.JLabel();
        progress_pbar = new javax.swing.JProgressBar();
        pause_button = new javax.swing.JButton();
        stop_button = new javax.swing.JButton();
        keep_temp_checkbox = new javax.swing.JCheckBox();
        file_name_label = new javax.swing.JLabel();
        close_button = new javax.swing.JButton();
        copy_link_button = new javax.swing.JButton();
        restart_button = new javax.swing.JButton();
        file_size_label = new javax.swing.JLabel();
        slot_status_label = new javax.swing.JLabel();
        open_folder_button = new javax.swing.JButton();

        setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 204, 255), 3, true));

        status_label.setFont(new java.awt.Font("Dialog", 1, 20)); // NOI18N
        status_label.setForeground(new java.awt.Color(102, 102, 102));
        status_label.setText("status");
        status_label.setDoubleBuffered(true);

        slots_label.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        slots_label.setText("Slots");
        slots_label.setDoubleBuffered(true);

        slots_spinner.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        slots_spinner.setToolTipText("Slots");
        slots_spinner.setDoubleBuffered(true);
        slots_spinner.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                slots_spinnerStateChanged(evt);
            }
        });

        speed_label.setFont(new java.awt.Font("Dialog", 3, 26)); // NOI18N
        speed_label.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        speed_label.setText("speed");
        speed_label.setDoubleBuffered(true);

        progress_pbar.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        progress_pbar.setDoubleBuffered(true);

        pause_button.setBackground(new java.awt.Color(255, 153, 0));
        pause_button.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        pause_button.setForeground(java.awt.Color.white);
        pause_button.setText("PAUSE DOWNLOAD");
        pause_button.setDoubleBuffered(true);
        pause_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pause_buttonActionPerformed(evt);
            }
        });

        stop_button.setBackground(new java.awt.Color(255, 0, 0));
        stop_button.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        stop_button.setForeground(java.awt.Color.white);
        stop_button.setText("CANCEL DOWNLOAD");
        stop_button.setDoubleBuffered(true);
        stop_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                stop_buttonActionPerformed(evt);
            }
        });

        keep_temp_checkbox.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        keep_temp_checkbox.setSelected(true);
        keep_temp_checkbox.setText("Keep temp file");
        keep_temp_checkbox.setDoubleBuffered(true);

        file_name_label.setFont(new java.awt.Font("Dialog", 1, 20)); // NOI18N
        file_name_label.setForeground(new java.awt.Color(0, 102, 153));
        file_name_label.setText("Archivo de prueba xxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
        file_name_label.setDoubleBuffered(true);

        close_button.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        close_button.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8-cancel-30.png"))); // NOI18N
        close_button.setText("Close");
        close_button.setDoubleBuffered(true);
        close_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                close_buttonActionPerformed(evt);
            }
        });

        copy_link_button.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        copy_link_button.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8-copy-to-clipboard-30.png"))); // NOI18N
        copy_link_button.setText("Copy link");
        copy_link_button.setDoubleBuffered(true);
        copy_link_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                copy_link_buttonActionPerformed(evt);
            }
        });

        restart_button.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        restart_button.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8-restart-30.png"))); // NOI18N
        restart_button.setText("Restart");
        restart_button.setDoubleBuffered(true);
        restart_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                restart_buttonActionPerformed(evt);
            }
        });

        file_size_label.setFont(new java.awt.Font("Dialog", 1, 20)); // NOI18N
        file_size_label.setForeground(new java.awt.Color(0, 102, 153));
        file_size_label.setText("500 MB");
        file_size_label.setDoubleBuffered(true);

        slot_status_label.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        slot_status_label.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        slot_status_label.setDoubleBuffered(true);

        open_folder_button.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        open_folder_button.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8-folder-30.png"))); // NOI18N
        open_folder_button.setText("Open folder");
        open_folder_button.setDoubleBuffered(true);
        open_folder_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                open_folder_buttonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(progress_pbar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(status_label, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(slots_label)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(slots_spinner, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(file_name_label, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(slot_status_label))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(file_size_label, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(6, 6, 6)
                        .addComponent(open_folder_button)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(copy_link_button))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(speed_label, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(pause_button))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(close_button)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(restart_button)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(keep_temp_checkbox)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(stop_button)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(slots_spinner, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(slots_label)
                    .addComponent(status_label))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(slot_status_label)
                    .addComponent(file_name_label))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(copy_link_button, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(open_folder_button)
                        .addComponent(file_size_label)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(progress_pbar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(speed_label)
                    .addComponent(pause_button))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(close_button)
                        .addComponent(restart_button))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(stop_button)
                        .addComponent(keep_temp_checkbox)))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void slots_spinnerStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_slots_spinnerStateChanged

        THREAD_POOL.execute(new Runnable() {

            @Override
            public void run() {

                if (_download.isUse_slots()) {
                    _download.checkSlotsAndWorkers();
                }

            }
        });
    }//GEN-LAST:event_slots_spinnerStateChanged

    private void close_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_close_buttonActionPerformed

        _download.close();
        close_button.setVisible(false);
    }//GEN-LAST:event_close_buttonActionPerformed

    private void copy_link_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_copy_link_buttonActionPerformed

        copyTextToClipboard(_download.getUrl());

        JOptionPane.showMessageDialog(_download.getMain_panel().getView(), "Link was copied to clipboard!");
    }//GEN-LAST:event_copy_link_buttonActionPerformed

    private void restart_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_restart_buttonActionPerformed

        _download.restart();

    }//GEN-LAST:event_restart_buttonActionPerformed

    private void stop_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_stop_buttonActionPerformed

        _download.stop();

    }//GEN-LAST:event_stop_buttonActionPerformed

    private void pause_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pause_buttonActionPerformed

        _download.pause();
    }//GEN-LAST:event_pause_buttonActionPerformed

    private void open_folder_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_open_folder_buttonActionPerformed

        if (Desktop.isDesktopSupported()) {
            try {
                Desktop.getDesktop().open(new File(_download.getDownload_path() + "/" + _download.getFile_name()).getParentFile());
            } catch (IOException ex) {
                JOptionPane.showMessageDialog(_download.getMain_panel().getView(), "Folder not found");
            }
        }

    }//GEN-LAST:event_open_folder_buttonActionPerformed

    @Override
    public void pause() {

        printStatusNormal("Pausing download ...");

        swingInvoke(
                new Runnable() {
            @Override
            public void run() {

                for (JComponent c : new JComponent[]{pause_button, speed_label, slots_label, slots_spinner, progress_pbar, file_name_label, file_size_label}) {

                    c.setEnabled(false);
                }

                for (JComponent c : new JComponent[]{stop_button, keep_temp_checkbox}) {

                    c.setVisible(true);
                }
            }
        });
    }

    @Override
    public void resume() {

        printStatusNormal("Downloading file from mega ...");

        swingInvoke(
                new Runnable() {
            @Override
            public void run() {

                for (JComponent c : new JComponent[]{pause_button, speed_label, slots_label, slots_spinner, progress_pbar, file_name_label, file_size_label}) {

                    c.setEnabled(true);
                }

                for (JComponent c : new JComponent[]{stop_button, keep_temp_checkbox}) {

                    c.setVisible(false);
                }

                pause_button.setText("PAUSE DOWNLOAD");
                _download.getMain_panel().getView().getPause_all_down_button().setVisible(true);
            }
        });

    }

    @Override
    public void stop(String status) {

        printStatusNormal(status);

        swingInvoke(
                new Runnable() {
            @Override
            public void run() {

                for (JComponent c : new JComponent[]{pause_button, keep_temp_checkbox, stop_button, speed_label, slots_label, slots_spinner, progress_pbar, file_name_label, file_size_label}) {

                    c.setEnabled(false);
                }

            }
        });

    }

    @Override
    public void updateSpeed(final String speed, final Boolean visible) {

        swingInvoke(
                new Runnable() {
            @Override
            public void run() {

                if (speed != null) {
                    speed_label.setText(speed);
                }

                if (visible != null) {
                    speed_label.setVisible(visible);
                }
            }
        });
    }

    @Override
    public void updateProgressBar(final long progress, final double bar_rate) {

        swingInvoke(
                new Runnable() {
            @Override
            public void run() {

                progress_pbar.setValue((int) Math.ceil(bar_rate * progress));
            }
        });
    }

    @Override
    public void updateProgressBar(final int value) {
        swingInvoke(
                new Runnable() {
            @Override
            public void run() {

                progress_pbar.setValue(value);
            }
        });
    }

    @Override
    public void printStatusError(final String message) {

        swingInvoke(
                new Runnable() {
            @Override
            public void run() {

                status_label.setForeground(Color.red);
                status_label.setText(message);
            }
        });
    }

    @Override
    public void printStatusOK(final String message) {

        swingInvoke(
                new Runnable() {
            @Override
            public void run() {

                status_label.setForeground(new Color(0, 170, 0));
                status_label.setText(message);
            }
        });
    }

    @Override
    public void printStatusNormal(final String message) {

        swingInvoke(
                new Runnable() {
            @Override
            public void run() {

                status_label.setForeground(new Color(102, 102, 102));
                status_label.setText(message);
            }
        });

    }

    @Override
    public void updateSlotsStatus() {

        synchronized (_download.getWorkers_lock()) {

            int conta_exit = 0;

            for (ChunkDownloader c : _download.getChunkworkers()) {

                if (c.isExit()) {

                    conta_exit++;
                }
            }

            int conta_error = 0;

            for (ChunkDownloader c : _download.getChunkworkers()) {

                if (c.isError_wait()) {

                    conta_error++;
                }
            }

            final Color status_color = conta_error > 0 ? Color.red : Color.black;

            final String status = (conta_exit > 0 ? "Removing: " + conta_exit : "") + (conta_error > 0 ? ((conta_exit > 0 ? " / " : "") + "Error: " + conta_error) : "");

            swingInvoke(new Runnable() {
                @Override
                public void run() {
                    slot_status_label.setForeground(status_color);
                    slot_status_label.setText(status);
                }
            });
        }
    }

    @Override
    public int getSlots() {
        return (int) swingInvokeAndWaitForReturn(new Callable() {

            @Override
            public Object call() throws Exception {

                return getSlots_spinner().getValue();
            }

        });
    }

    public boolean isKeepTempFileSelected() {

        return (boolean) swingInvokeAndWaitForReturn(new Callable() {

            @Override
            public Object call() throws Exception {

                return getKeep_temp_checkbox().isSelected();
            }

        });
    }

    public void set509Error(boolean error) {

        _download.setError509(error);

        speed_label.setIcon(error ? new javax.swing.ImageIcon(getClass().getResource("/images/icons8-error-40.png")) : null);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton close_button;
    private javax.swing.JButton copy_link_button;
    private javax.swing.JLabel file_name_label;
    private javax.swing.JLabel file_size_label;
    private javax.swing.JCheckBox keep_temp_checkbox;
    private javax.swing.JButton open_folder_button;
    private javax.swing.JButton pause_button;
    private javax.swing.JProgressBar progress_pbar;
    private javax.swing.JButton restart_button;
    private javax.swing.JLabel slot_status_label;
    private javax.swing.JLabel slots_label;
    private javax.swing.JSpinner slots_spinner;
    private javax.swing.JLabel speed_label;
    private javax.swing.JLabel status_label;
    private javax.swing.JButton stop_button;
    // End of variables declaration//GEN-END:variables

}
