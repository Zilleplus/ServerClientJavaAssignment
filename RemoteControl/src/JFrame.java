
import java.io.BufferedReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.awt.event.*;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.UnknownHostException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;

/* Version 1.0
 * 
 * RemoteControl is an basic home automation and remote access software that is written in java. 
 * With RemoteControl, you can control and monitor lighting, audio, security, temperature, in your home. 
 * It works on EVERY operating system. And up and running in Minutes!
 *
 */
public class JFrame extends javax.swing.JFrame {

    private Socket echoSocket = null;
    private PrintWriter out = null;
    private BufferedReader in = null;
    private String host = "localhost", code = "", password = "1234", tijd = "";
    private Timer timer;
    private StringBuffer sb = new StringBuffer("This program is brought to you by Seppe and Willem     ");
    char temp = ' ';
    int len = sb.length();
    private int room = 0, volume[] = new int[3];

    public JFrame() {
        initComponents();
        setContentPane(jPanelConnect);
        timer = new Timer(100, new TimerHandler());
        timer.start();
    }

    class TimerHandler implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            tijd = new SimpleDateFormat("HH:mm:ss").format(new Date());
            jLabelConnectTime.setText(tijd);
            jLabelMusicTime.setText(tijd);
            jLabelSecurityTime.setText(tijd);
            //jLabelSecurityAccesTime.setText(tijd);
            jLabelTempTime.setText(tijd);
            jLabelLichtTime.setText(tijd);

            temp = sb.charAt(0);
            for (int pos = 0; pos < len - 1; pos++) {
                sb.setCharAt(pos, sb.charAt(pos + 1));
            }
            sb.setCharAt(len - 1, temp);
            jLabelHomeCredit.setText(sb.toString().substring(0, 50));
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelConnect = new javax.swing.JPanel();
        jPanelConnectButtonDisabled = new javax.swing.JPanel();
        jLabelConnectLichtDisabled = new javax.swing.JLabel();
        jLabelConnectWeatherDisabled = new javax.swing.JLabel();
        jLabelConnectSecurityDisabled = new javax.swing.JLabel();
        jLabelConnectMusicDisabled = new javax.swing.JLabel();
        jPanelConnectBelt = new javax.swing.JPanel();
        jLabelConnectBeltConnect = new javax.swing.JLabel();
        jLabelConnectTime = new javax.swing.JLabel();
        jLabelConnectBelt = new javax.swing.JLabel();
        jLabelConnectBeltConnectStop = new javax.swing.JLabel();
        jLabelConnectBackground = new javax.swing.JLabel();
        jPanelHome = new javax.swing.JPanel();
        jPanelHomeButton = new javax.swing.JPanel();
        jLabelHomeLicht = new javax.swing.JLabel();
        jLabelHomeWeather = new javax.swing.JLabel();
        jLabelHomeSecurity = new javax.swing.JLabel();
        jLabelHomeMusic = new javax.swing.JLabel();
        jLabelHomeCredit = new javax.swing.JLabel();
        jLabelHomeBackground = new javax.swing.JLabel();
        jPanelSecurity = new javax.swing.JPanel();
        jLabelSecurityTime = new javax.swing.JLabel();
        jLabelSecurityBack = new javax.swing.JLabel();
        jLabelSecurityCode = new javax.swing.JLabel();
        jTextFieldSecurityCode = new javax.swing.JTextField();
        jTextFieldSecurityButton = new javax.swing.JPanel();
        jLabelSecurity1 = new javax.swing.JLabel();
        jLabelSecurity2 = new javax.swing.JLabel();
        jLabelSecurity3 = new javax.swing.JLabel();
        jLabelSecurity4 = new javax.swing.JLabel();
        jLabelSecurity5 = new javax.swing.JLabel();
        jLabelSecurity6 = new javax.swing.JLabel();
        jLabelSecurity7 = new javax.swing.JLabel();
        jLabelSecurity8 = new javax.swing.JLabel();
        jLabelSecurity9 = new javax.swing.JLabel();
        jLabelSecurity0 = new javax.swing.JLabel();
        jLabelSecurityReset = new javax.swing.JLabel();
        jLabelSecurityOk = new javax.swing.JLabel();
        jLabelSecurityBackground = new javax.swing.JLabel();
        jPanelSecurityAcces = new javax.swing.JPanel();
        jLabelSecurityAccesTime = new javax.swing.JLabel();
        jLabelSecurityAccesBack = new javax.swing.JLabel();
        jLabelSecurityLock = new javax.swing.JLabel();
        jLabelSecurityLock1 = new javax.swing.JLabel();
        jLabelSecurityLock2 = new javax.swing.JLabel();
        jPanelSecuritySlider2 = new javax.swing.JPanel();
        jLabelSecuritySliderButton2 = new javax.swing.JLabel();
        jLabelSecuritySlideToUnlock2 = new javax.swing.JLabel();
        jLabelSecurityBG2 = new javax.swing.JLabel();
        jLabelSecurityStop2 = new javax.swing.JLabel();
        jLabelSecurityBegin2 = new javax.swing.JLabel();
        jLabelSecurityLogo2 = new javax.swing.JLabel();
        jPanelSecuritySlider1 = new javax.swing.JPanel();
        jLabelSecuritySliderButton1 = new javax.swing.JLabel();
        jLabelSecuritySlideToUnlock1 = new javax.swing.JLabel();
        jLabelSecurityBG1 = new javax.swing.JLabel();
        jLabelSecurityStop1 = new javax.swing.JLabel();
        jLabelSecurityBegin1 = new javax.swing.JLabel();
        jLabelSecurityLogo1 = new javax.swing.JLabel();
        jPanelSecuritySlider = new javax.swing.JPanel();
        jLabelSecuritySliderButton = new javax.swing.JLabel();
        jLabelSecuritySlideToUnlock = new javax.swing.JLabel();
        jLabelSecurityBG = new javax.swing.JLabel();
        jLabelSecurityStop = new javax.swing.JLabel();
        jLabelSecurityBegin = new javax.swing.JLabel();
        jLabelSecurityLogo = new javax.swing.JLabel();
        jLabelSecurityAccesBackground = new javax.swing.JLabel();
        jPanelMusic = new javax.swing.JPanel();
        jLabelMusicTime = new javax.swing.JLabel();
        jPanelMusicVolume = new javax.swing.JPanel();
        jLabelMusicPlus = new javax.swing.JLabel();
        jLabelMusicMin = new javax.swing.JLabel();
        jLabelMusicVolume = new javax.swing.JLabel();
        jLabelMusicVolume1 = new javax.swing.JLabel();
        jLabelMusicPlus1 = new javax.swing.JLabel();
        jLabelMusicMin1 = new javax.swing.JLabel();
        jLabelMusicVolume2 = new javax.swing.JLabel();
        jLabelMusicPlus2 = new javax.swing.JLabel();
        jLabelMusicMin2 = new javax.swing.JLabel();
        jLabelMusicBack = new javax.swing.JLabel();
        jLabelMusicRoom = new javax.swing.JLabel();
        jLabelMusicRoom1 = new javax.swing.JLabel();
        jLabelMusicRoom2 = new javax.swing.JLabel();
        jLabelMusicBackground = new javax.swing.JLabel();
        jPanelTemp = new javax.swing.JPanel();
        jLabelTemp0 = new javax.swing.JLabel();
        jLabelTemp1 = new javax.swing.JLabel();
        jLabelTemp2 = new javax.swing.JLabel();
        jLabelTemp3 = new javax.swing.JLabel();
        jLabelTemp4 = new javax.swing.JLabel();
        jLabelTempBath = new javax.swing.JLabel();
        jLabelTempBed = new javax.swing.JLabel();
        jLabelTempLiving = new javax.swing.JLabel();
        jLabelTempKitchen = new javax.swing.JLabel();
        jLabelTempTime = new javax.swing.JLabel();
        jLabelTemp = new javax.swing.JLabel();
        jLabelTempBack = new javax.swing.JLabel();
        jSliderTempDim = new javax.swing.JSlider();
        jLabelTempBackground = new javax.swing.JLabel();
        jPanelLicht = new javax.swing.JPanel();
        jLabelLichtKitchen = new javax.swing.JLabel();
        jLabelLichtTime = new javax.swing.JLabel();
        jLabelLichtBed = new javax.swing.JLabel();
        jLabelLichtLiving = new javax.swing.JLabel();
        jLabelLichtBath = new javax.swing.JLabel();
        jLabelLichtLicht = new javax.swing.JLabel();
        jLabelLichtBack = new javax.swing.JLabel();
        jLabelLichtHome = new javax.swing.JLabel();
        jSliderLichtDim = new javax.swing.JSlider();
        jLabelLichtBackground = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("RemoteControl");
        setMinimumSize(new java.awt.Dimension(800, 500));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanelConnect.setMinimumSize(new java.awt.Dimension(800, 500));
        jPanelConnect.setPreferredSize(new java.awt.Dimension(800, 500));
        jPanelConnect.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanelConnectButtonDisabled.setOpaque(false);

        jLabelConnectLichtDisabled.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/screen/lightdim.png"))); // NOI18N

        jLabelConnectWeatherDisabled.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/screen/weatherdim.png"))); // NOI18N

        jLabelConnectSecurityDisabled.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/screen/securitydim.png"))); // NOI18N

        jLabelConnectMusicDisabled.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/screen/musicdim.png"))); // NOI18N

        javax.swing.GroupLayout jPanelConnectButtonDisabledLayout = new javax.swing.GroupLayout(jPanelConnectButtonDisabled);
        jPanelConnectButtonDisabled.setLayout(jPanelConnectButtonDisabledLayout);
        jPanelConnectButtonDisabledLayout.setHorizontalGroup(
            jPanelConnectButtonDisabledLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 560, Short.MAX_VALUE)
            .addGroup(jPanelConnectButtonDisabledLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanelConnectButtonDisabledLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jLabelConnectLichtDisabled)
                    .addComponent(jLabelConnectWeatherDisabled)
                    .addComponent(jLabelConnectSecurityDisabled)
                    .addComponent(jLabelConnectMusicDisabled)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        jPanelConnectButtonDisabledLayout.setVerticalGroup(
            jPanelConnectButtonDisabledLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 140, Short.MAX_VALUE)
            .addGroup(jPanelConnectButtonDisabledLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanelConnectButtonDisabledLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addGroup(jPanelConnectButtonDisabledLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabelConnectLichtDisabled)
                        .addComponent(jLabelConnectWeatherDisabled)
                        .addComponent(jLabelConnectSecurityDisabled)
                        .addComponent(jLabelConnectMusicDisabled))
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        jPanelConnect.add(jPanelConnectButtonDisabled, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 120, -1, -1));

        jPanelConnectBelt.setOpaque(false);
        jPanelConnectBelt.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelConnectBeltConnect.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/screen/beltButton.png"))); // NOI18N
        jLabelConnectBeltConnect.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentMoved(java.awt.event.ComponentEvent evt) {
                jLabelConnectBeltConnectComponentMoved(evt);
            }
        });
        jLabelConnectBeltConnect.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jLabelConnectBeltConnectMouseDragged(evt);
            }
        });
        jPanelConnectBelt.add(jLabelConnectBeltConnect, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 14, -1, -1));

        jLabelConnectTime.setFont(new java.awt.Font("Tahoma", 0, 24));
        jLabelConnectTime.setForeground(new java.awt.Color(255, 255, 255));
        jPanelConnectBelt.add(jLabelConnectTime, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 50, 150, 30));

        jLabelConnectBelt.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/screen/belt.png"))); // NOI18N
        jPanelConnectBelt.add(jLabelConnectBelt, new org.netbeans.lib.awtextra.AbsoluteConstraints(5, 11, -1, -1));
        jPanelConnectBelt.add(jLabelConnectBeltConnectStop, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 30, 10, -1));

        jPanelConnect.add(jPanelConnectBelt, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 344, 610, 120));

        jLabelConnectBackground.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/screen/connectBackground.png"))); // NOI18N
        jPanelConnect.add(jLabelConnectBackground, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        getContentPane().add(jPanelConnect, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jPanelHome.setPreferredSize(new java.awt.Dimension(800, 500));
        jPanelHome.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanelHomeButton.setOpaque(false);

        jLabelHomeLicht.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/screen/lightdim.png"))); // NOI18N
        jLabelHomeLicht.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabelHomeLicht.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelHomeLichtMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabelHomeLichtMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabelHomeLichtMouseExited(evt);
            }
        });

        jLabelHomeWeather.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/screen/weatherdim.png"))); // NOI18N
        jLabelHomeWeather.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabelHomeWeather.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelHomeWeatherMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabelHomeWeatherMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabelHomeWeatherMouseExited(evt);
            }
        });

        jLabelHomeSecurity.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/screen/securitydim.png"))); // NOI18N
        jLabelHomeSecurity.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabelHomeSecurity.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelHomeSecurityMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabelHomeSecurityMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabelHomeSecurityMouseExited(evt);
            }
        });

        jLabelHomeMusic.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/screen/musicdim.png"))); // NOI18N
        jLabelHomeMusic.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabelHomeMusic.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelHomeMusicMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabelHomeMusicMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabelHomeMusicMouseExited(evt);
            }
        });

        javax.swing.GroupLayout jPanelHomeButtonLayout = new javax.swing.GroupLayout(jPanelHomeButton);
        jPanelHomeButton.setLayout(jPanelHomeButtonLayout);
        jPanelHomeButtonLayout.setHorizontalGroup(
            jPanelHomeButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 580, Short.MAX_VALUE)
            .addGroup(jPanelHomeButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanelHomeButtonLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jLabelHomeLicht)
                    .addComponent(jLabelHomeWeather)
                    .addComponent(jLabelHomeSecurity)
                    .addComponent(jLabelHomeMusic)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        jPanelHomeButtonLayout.setVerticalGroup(
            jPanelHomeButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 140, Short.MAX_VALUE)
            .addGroup(jPanelHomeButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanelHomeButtonLayout.createSequentialGroup()
                    .addGap(0, 0, 0)
                    .addGroup(jPanelHomeButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabelHomeLicht)
                        .addComponent(jLabelHomeWeather)
                        .addComponent(jLabelHomeSecurity)
                        .addComponent(jLabelHomeMusic))
                    .addGap(0, 0, 0)))
        );

        jPanelHome.add(jPanelHomeButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(94, 120, 580, -1));

        jLabelHomeCredit.setFont(new java.awt.Font("Tahoma", 0, 14));
        jLabelHomeCredit.setForeground(new java.awt.Color(204, 204, 204));
        jLabelHomeCredit.setToolTipText("");
        jPanelHome.add(jLabelHomeCredit, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 410, 410, 50));

        jLabelHomeBackground.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/screen/connectBackground.png"))); // NOI18N
        jPanelHome.add(jLabelHomeBackground, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        getContentPane().add(jPanelHome, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jPanelSecurity.setOpaque(false);
        jPanelSecurity.setPreferredSize(new java.awt.Dimension(800, 500));
        jPanelSecurity.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelSecurityTime.setForeground(new java.awt.Color(204, 204, 204));
        jLabelSecurityTime.setText("Time");
        jPanelSecurity.add(jLabelSecurityTime, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, 50, 20));

        jLabelSecurityBack.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/screen/back.png"))); // NOI18N
        jLabelSecurityBack.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabelSecurityBack.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelSecurityBackMouseClicked(evt);
            }
        });
        jPanelSecurity.add(jLabelSecurityBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        jLabelSecurityCode.setBackground(new java.awt.Color(0, 0, 0));
        jLabelSecurityCode.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/security/pass.png"))); // NOI18N
        jPanelSecurity.add(jLabelSecurityCode, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 110, -1, 100));

        jTextFieldSecurityCode.setBackground(new java.awt.Color(0, 0, 0));
        jTextFieldSecurityCode.setEditable(false);
        jTextFieldSecurityCode.setFont(new java.awt.Font("Tahoma", 0, 36));
        jTextFieldSecurityCode.setForeground(new java.awt.Color(255, 255, 255));
        jTextFieldSecurityCode.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextFieldSecurityCode.setFocusable(false);
        jTextFieldSecurityCode.setOpaque(false);
        jPanelSecurity.add(jTextFieldSecurityCode, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 120, 260, 80));

        jTextFieldSecurityButton.setOpaque(false);
        jTextFieldSecurityButton.setLayout(new java.awt.GridLayout(4, 3));

        jLabelSecurity1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/security/onedim.png"))); // NOI18N
        jLabelSecurity1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelSecurity1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabelSecurity1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabelSecurity1MouseExited(evt);
            }
        });
        jTextFieldSecurityButton.add(jLabelSecurity1);

        jLabelSecurity2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/security/twodim.png"))); // NOI18N
        jLabelSecurity2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelSecurity2MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabelSecurity2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabelSecurity2MouseExited(evt);
            }
        });
        jTextFieldSecurityButton.add(jLabelSecurity2);

        jLabelSecurity3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/security/threedim.png"))); // NOI18N
        jLabelSecurity3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelSecurity3MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabelSecurity3MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabelSecurity3MouseExited(evt);
            }
        });
        jTextFieldSecurityButton.add(jLabelSecurity3);

        jLabelSecurity4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/security/fourdim.png"))); // NOI18N
        jLabelSecurity4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelSecurity4MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabelSecurity4MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabelSecurity4MouseExited(evt);
            }
        });
        jTextFieldSecurityButton.add(jLabelSecurity4);

        jLabelSecurity5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/security/fivedim.png"))); // NOI18N
        jLabelSecurity5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelSecurity5MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabelSecurity5MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabelSecurity5MouseExited(evt);
            }
        });
        jTextFieldSecurityButton.add(jLabelSecurity5);

        jLabelSecurity6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/security/sixdim.png"))); // NOI18N
        jLabelSecurity6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelSecurity6MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabelSecurity6MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabelSecurity6MouseExited(evt);
            }
        });
        jTextFieldSecurityButton.add(jLabelSecurity6);

        jLabelSecurity7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/security/sevendim.png"))); // NOI18N
        jLabelSecurity7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelSecurity7MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabelSecurity7MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabelSecurity7MouseExited(evt);
            }
        });
        jTextFieldSecurityButton.add(jLabelSecurity7);

        jLabelSecurity8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/security/eightdim.png"))); // NOI18N
        jLabelSecurity8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelSecurity8MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabelSecurity8MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabelSecurity8MouseExited(evt);
            }
        });
        jTextFieldSecurityButton.add(jLabelSecurity8);

        jLabelSecurity9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/security/ninedim.png"))); // NOI18N
        jLabelSecurity9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelSecurity9MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabelSecurity9MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabelSecurity9MouseExited(evt);
            }
        });
        jTextFieldSecurityButton.add(jLabelSecurity9);

        jLabelSecurity0.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/security/nulldim.png"))); // NOI18N
        jLabelSecurity0.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelSecurity0MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabelSecurity0MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabelSecurity0MouseExited(evt);
            }
        });
        jTextFieldSecurityButton.add(jLabelSecurity0);

        jLabelSecurityReset.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/security/resetdim.png"))); // NOI18N
        jLabelSecurityReset.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelSecurityResetMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabelSecurityResetMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabelSecurityResetMouseExited(evt);
            }
        });
        jTextFieldSecurityButton.add(jLabelSecurityReset);

        jLabelSecurityOk.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/security/OKbuttondim.png"))); // NOI18N
        jLabelSecurityOk.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelSecurityOkMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabelSecurityOkMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabelSecurityOkMouseExited(evt);
            }
        });
        jTextFieldSecurityButton.add(jLabelSecurityOk);

        jPanelSecurity.add(jTextFieldSecurityButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 100, 320, 260));

        jLabelSecurityBackground.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/screen/background.png"))); // NOI18N
        jPanelSecurity.add(jLabelSecurityBackground, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        getContentPane().add(jPanelSecurity, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jPanelSecurityAcces.setPreferredSize(new java.awt.Dimension(800, 500));
        jPanelSecurityAcces.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelSecurityAccesTime.setForeground(new java.awt.Color(204, 204, 204));
        jPanelSecurityAcces.add(jLabelSecurityAccesTime, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, 50, 20));

        jLabelSecurityAccesBack.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/screen/back.png"))); // NOI18N
        jLabelSecurityAccesBack.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabelSecurityAccesBack.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelSecurityAccesBackMouseClicked(evt);
            }
        });
        jPanelSecurityAcces.add(jLabelSecurityAccesBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        jLabelSecurityLock.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/security/lockclose.png"))); // NOI18N
        jPanelSecurityAcces.add(jLabelSecurityLock, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 100, -1, -1));

        jLabelSecurityLock1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/security/lockclose.png"))); // NOI18N
        jPanelSecurityAcces.add(jLabelSecurityLock1, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 200, -1, -1));

        jLabelSecurityLock2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/security/lockclose.png"))); // NOI18N
        jPanelSecurityAcces.add(jLabelSecurityLock2, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 300, -1, -1));

        jPanelSecuritySlider2.setOpaque(false);
        jPanelSecuritySlider2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelSecuritySliderButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/security/sliderlockbuttondim.png"))); // NOI18N
        jLabelSecuritySliderButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabelSecuritySliderButton2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabelSecuritySliderButton2MouseExited(evt);
            }
        });
        jLabelSecuritySliderButton2.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jLabelSecuritySliderButton2MouseDragged(evt);
            }
        });
        jPanelSecuritySlider2.add(jLabelSecuritySliderButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(125, 30, 70, -1));

        jLabelSecuritySlideToUnlock2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/security/sliderlocktxt.gif"))); // NOI18N
        jPanelSecuritySlider2.add(jLabelSecuritySlideToUnlock2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jLabelSecurityBG2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/security/sliderlockbg.png"))); // NOI18N
        jPanelSecuritySlider2.add(jLabelSecurityBG2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));
        jPanelSecuritySlider2.add(jLabelSecurityStop2, new org.netbeans.lib.awtextra.AbsoluteConstraints(382, 30, 0, -1));
        jPanelSecuritySlider2.add(jLabelSecurityBegin2, new org.netbeans.lib.awtextra.AbsoluteConstraints(125, 30, -1, -1));

        jLabelSecurityLogo2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/security/bedroom.png"))); // NOI18N
        jPanelSecuritySlider2.add(jLabelSecurityLogo2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 25, -1, -1));

        jPanelSecurityAcces.add(jPanelSecuritySlider2, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 300, 520, 90));

        jPanelSecuritySlider1.setOpaque(false);
        jPanelSecuritySlider1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelSecuritySliderButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/security/sliderlockbuttondim.png"))); // NOI18N
        jLabelSecuritySliderButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabelSecuritySliderButton1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabelSecuritySliderButton1MouseExited(evt);
            }
        });
        jLabelSecuritySliderButton1.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jLabelSecuritySliderButton1MouseDragged(evt);
            }
        });
        jPanelSecuritySlider1.add(jLabelSecuritySliderButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(125, 30, 70, -1));

        jLabelSecuritySlideToUnlock1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/security/sliderlocktxt.gif"))); // NOI18N
        jPanelSecuritySlider1.add(jLabelSecuritySlideToUnlock1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jLabelSecurityBG1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/security/sliderlockbg.png"))); // NOI18N
        jPanelSecuritySlider1.add(jLabelSecurityBG1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));
        jPanelSecuritySlider1.add(jLabelSecurityStop1, new org.netbeans.lib.awtextra.AbsoluteConstraints(382, 30, 0, -1));
        jPanelSecuritySlider1.add(jLabelSecurityBegin1, new org.netbeans.lib.awtextra.AbsoluteConstraints(125, 30, -1, -1));

        jLabelSecurityLogo1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/security/livingroom.png"))); // NOI18N
        jPanelSecuritySlider1.add(jLabelSecurityLogo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 25, -1, -1));

        jPanelSecurityAcces.add(jPanelSecuritySlider1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 200, 520, 90));

        jPanelSecuritySlider.setOpaque(false);
        jPanelSecuritySlider.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelSecuritySliderButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/security/sliderlockbuttondim.png"))); // NOI18N
        jLabelSecuritySliderButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabelSecuritySliderButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabelSecuritySliderButtonMouseExited(evt);
            }
        });
        jLabelSecuritySliderButton.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jLabelSecuritySliderButtonMouseDragged(evt);
            }
        });
        jPanelSecuritySlider.add(jLabelSecuritySliderButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(125, 30, 70, -1));

        jLabelSecuritySlideToUnlock.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/security/sliderlocktxt.gif"))); // NOI18N
        jPanelSecuritySlider.add(jLabelSecuritySlideToUnlock, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jLabelSecurityBG.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/security/sliderlockbg.png"))); // NOI18N
        jPanelSecuritySlider.add(jLabelSecurityBG, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));
        jPanelSecuritySlider.add(jLabelSecurityStop, new org.netbeans.lib.awtextra.AbsoluteConstraints(382, 30, 0, -1));
        jPanelSecuritySlider.add(jLabelSecurityBegin, new org.netbeans.lib.awtextra.AbsoluteConstraints(125, 30, -1, -1));

        jLabelSecurityLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/security/kitchen.png"))); // NOI18N
        jPanelSecuritySlider.add(jLabelSecurityLogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, -1, -1));

        jPanelSecurityAcces.add(jPanelSecuritySlider, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 90, 520, 90));

        jLabelSecurityAccesBackground.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/screen/background.png"))); // NOI18N
        jPanelSecurityAcces.add(jLabelSecurityAccesBackground, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        getContentPane().add(jPanelSecurityAcces, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jPanelMusic.setPreferredSize(new java.awt.Dimension(800, 500));
        jPanelMusic.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelMusicTime.setForeground(new java.awt.Color(204, 204, 204));
        jLabelMusicTime.setText("Time");
        jPanelMusic.add(jLabelMusicTime, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, 50, 20));

        jPanelMusicVolume.setOpaque(false);
        jPanelMusicVolume.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelMusicPlus.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/music/plusdim.png"))); // NOI18N
        jLabelMusicPlus.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelMusicPlusMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabelMusicPlusMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabelMusicPlusMouseExited(evt);
            }
        });
        jPanelMusicVolume.add(jLabelMusicPlus, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 37, -1, -1));

        jLabelMusicMin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/music/mindim.png"))); // NOI18N
        jLabelMusicMin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelMusicMinMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabelMusicMinMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabelMusicMinMouseExited(evt);
            }
        });
        jPanelMusicVolume.add(jLabelMusicMin, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 37, -1, -1));

        jLabelMusicVolume.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/music/volume0.png"))); // NOI18N
        jPanelMusicVolume.add(jLabelMusicVolume, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 0, -1, -1));

        jLabelMusicVolume1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/music/volume0.png"))); // NOI18N
        jPanelMusicVolume.add(jLabelMusicVolume1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 100, -1, -1));

        jLabelMusicPlus1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/music/plusdim.png"))); // NOI18N
        jLabelMusicPlus1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelMusicPlus1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabelMusicPlus1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabelMusicPlus1MouseExited(evt);
            }
        });
        jPanelMusicVolume.add(jLabelMusicPlus1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 137, -1, -1));

        jLabelMusicMin1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/music/mindim.png"))); // NOI18N
        jLabelMusicMin1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelMusicMin1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabelMusicMin1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabelMusicMin1MouseExited(evt);
            }
        });
        jPanelMusicVolume.add(jLabelMusicMin1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 137, -1, -1));

        jLabelMusicVolume2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/music/volume0.png"))); // NOI18N
        jPanelMusicVolume.add(jLabelMusicVolume2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 200, -1, -1));

        jLabelMusicPlus2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/music/plusdim.png"))); // NOI18N
        jLabelMusicPlus2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelMusicPlus2MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabelMusicPlus2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabelMusicPlus2MouseExited(evt);
            }
        });
        jPanelMusicVolume.add(jLabelMusicPlus2, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 237, -1, -1));

        jLabelMusicMin2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/music/mindim.png"))); // NOI18N
        jLabelMusicMin2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelMusicMin2MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabelMusicMin2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabelMusicMin2MouseExited(evt);
            }
        });
        jPanelMusicVolume.add(jLabelMusicMin2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 237, -1, -1));

        jPanelMusic.add(jPanelMusicVolume, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 80, 340, 360));

        jLabelMusicBack.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/screen/back.png"))); // NOI18N
        jLabelMusicBack.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabelMusicBack.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelMusicBackMouseClicked(evt);
            }
        });
        jPanelMusic.add(jLabelMusicBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        jLabelMusicRoom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/music/shower.png"))); // NOI18N
        jPanelMusic.add(jLabelMusicRoom, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 90, -1, -1));

        jLabelMusicRoom1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/music/bedroom.png"))); // NOI18N
        jPanelMusic.add(jLabelMusicRoom1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 180, -1, -1));

        jLabelMusicRoom2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/music/livingroom.png"))); // NOI18N
        jPanelMusic.add(jLabelMusicRoom2, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 280, -1, -1));

        jLabelMusicBackground.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/screen/background.png"))); // NOI18N
        jPanelMusic.add(jLabelMusicBackground, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        getContentPane().add(jPanelMusic, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jPanelTemp.setPreferredSize(new java.awt.Dimension(800, 500));
        jPanelTemp.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelTemp0.setFont(new java.awt.Font("Tahoma", 0, 48));
        jLabelTemp0.setForeground(new java.awt.Color(255, 255, 255));
        jLabelTemp0.setToolTipText("");
        jLabelTemp0.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jPanelTemp.add(jLabelTemp0, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 80, 70, 50));

        jLabelTemp1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabelTemp1.setForeground(new java.awt.Color(255, 255, 255));
        jPanelTemp.add(jLabelTemp1, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 350, 50, 40));

        jLabelTemp2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabelTemp2.setForeground(new java.awt.Color(255, 255, 255));
        jPanelTemp.add(jLabelTemp2, new org.netbeans.lib.awtextra.AbsoluteConstraints(263, 342, 50, 40));

        jLabelTemp3.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabelTemp3.setForeground(new java.awt.Color(255, 255, 255));
        jPanelTemp.add(jLabelTemp3, new org.netbeans.lib.awtextra.AbsoluteConstraints(648, 350, 50, 40));

        jLabelTemp4.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabelTemp4.setForeground(new java.awt.Color(255, 255, 255));
        jPanelTemp.add(jLabelTemp4, new org.netbeans.lib.awtextra.AbsoluteConstraints(523, 342, 50, 40));

        jLabelTempBath.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/weather/bathroom.png"))); // NOI18N
        jPanelTemp.add(jLabelTempBath, new org.netbeans.lib.awtextra.AbsoluteConstraints(405, 290, -1, -1));

        jLabelTempBed.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/weather/bedroom.png"))); // NOI18N
        jPanelTemp.add(jLabelTempBed, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 300, -1, -1));

        jLabelTempLiving.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/weather/living.png"))); // NOI18N
        jPanelTemp.add(jLabelTempLiving, new org.netbeans.lib.awtextra.AbsoluteConstraints(145, 290, -1, -1));

        jLabelTempKitchen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/weather/kitchen.png"))); // NOI18N
        jPanelTemp.add(jLabelTempKitchen, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 300, -1, -1));

        jLabelTempTime.setForeground(new java.awt.Color(204, 204, 204));
        jLabelTempTime.setText("Time");
        jPanelTemp.add(jLabelTempTime, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, 50, 20));

        jLabelTemp.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/weather/thermometer.png"))); // NOI18N
        jPanelTemp.add(jLabelTemp, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 0, -1, -1));

        jLabelTempBack.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/screen/back.png"))); // NOI18N
        jLabelTempBack.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabelTempBack.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelTempBackMouseClicked(evt);
            }
        });
        jPanelTemp.add(jLabelTempBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        jSliderTempDim.setMajorTickSpacing(10);
        jSliderTempDim.setMaximum(40);
        jSliderTempDim.setMinorTickSpacing(1);
        jSliderTempDim.setPaintLabels(true);
        jSliderTempDim.setPaintTicks(true);
        jSliderTempDim.setToolTipText("");
        jSliderTempDim.setValue(20);
        jSliderTempDim.setOpaque(false);
        jSliderTempDim.setPreferredSize(new java.awt.Dimension(60, 200));
        jSliderTempDim.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jSliderTempDimStateChanged(evt);
            }
        });
        jPanelTemp.add(jSliderTempDim, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 170, 250, 80));

        jLabelTempBackground.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/screen/background.png"))); // NOI18N
        jPanelTemp.add(jLabelTempBackground, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        getContentPane().add(jPanelTemp, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jPanelLicht.setMaximumSize(new java.awt.Dimension(800, 500));
        jPanelLicht.setMinimumSize(new java.awt.Dimension(800, 500));
        jPanelLicht.setPreferredSize(new java.awt.Dimension(800, 500));
        jPanelLicht.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelLichtKitchen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/light/kitchen.png"))); // NOI18N
        jLabelLichtKitchen.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabelLichtKitchen.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelLichtKitchenMouseClicked(evt);
            }
        });
        jPanelLicht.add(jLabelLichtKitchen, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 50, -1, -1));

        jLabelLichtTime.setForeground(new java.awt.Color(204, 204, 204));
        jLabelLichtTime.setText("Time");
        jPanelLicht.add(jLabelLichtTime, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, 50, 20));

        jLabelLichtBed.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/light/bedroom.png"))); // NOI18N
        jLabelLichtBed.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabelLichtBed.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelLichtBedMouseClicked(evt);
            }
        });
        jPanelLicht.add(jLabelLichtBed, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 210, -1, -1));

        jLabelLichtLiving.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/light/livingroom.png"))); // NOI18N
        jLabelLichtLiving.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabelLichtLiving.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelLichtLivingMouseClicked(evt);
            }
        });
        jPanelLicht.add(jLabelLichtLiving, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, -1, -1));

        jLabelLichtBath.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/light/shower.png"))); // NOI18N
        jLabelLichtBath.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabelLichtBath.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelLichtBathMouseClicked(evt);
            }
        });
        jPanelLicht.add(jLabelLichtBath, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 310, -1, -1));

        jLabelLichtLicht.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/light/light1.png"))); // NOI18N
        jPanelLicht.add(jLabelLichtLicht, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, -110, -1, -1));

        jLabelLichtBack.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/screen/back.png"))); // NOI18N
        jLabelLichtBack.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabelLichtBack.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelLichtBackMouseClicked(evt);
            }
        });
        jPanelLicht.add(jLabelLichtBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        jLabelLichtHome.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/light/home.png"))); // NOI18N
        jLabelLichtHome.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabelLichtHome.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelLichtHomeMouseClicked(evt);
            }
        });
        jPanelLicht.add(jLabelLichtHome, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 415, 0, 0));

        jSliderLichtDim.setBackground(new java.awt.Color(153, 0, 102));
        jSliderLichtDim.setForeground(new java.awt.Color(204, 204, 204));
        jSliderLichtDim.setMajorTickSpacing(10);
        jSliderLichtDim.setPaintLabels(true);
        jSliderLichtDim.setPaintTicks(true);
        jSliderLichtDim.setToolTipText("");
        jSliderLichtDim.setValue(0);
        jSliderLichtDim.setOpaque(false);
        jSliderLichtDim.setPreferredSize(new java.awt.Dimension(60, 200));
        jSliderLichtDim.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jSliderLichtDimStateChanged(evt);
            }
        });
        jPanelLicht.add(jSliderLichtDim, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 340, 250, 60));

        jLabelLichtBackground.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/screen/background.png"))); // NOI18N
        jPanelLicht.add(jLabelLichtBackground, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        getContentPane().add(jPanelLicht, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

private void jSliderLichtDimStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jSliderLichtDimStateChanged
    int getal = (int) Math.ceil((jSliderLichtDim.getValue() / 20.0) + 1);
    jLabelLichtLicht.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/light/light" + getal + ".png")));
    for (int i = 0; i < 4; i++) {
        execute("&1 " + (room * 4 + i) + " " + jSliderLichtDim.getValue());
    }
}//GEN-LAST:event_jSliderLichtDimStateChanged

private void jSliderTempDimStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jSliderTempDimStateChanged
    jLabelTemp0.setText("" + jSliderTempDim.getValue());
    execute("&2 " + jSliderTempDim.getValue());
}//GEN-LAST:event_jSliderTempDimStateChanged

private void jLabelConnectBeltConnectComponentMoved(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_jLabelConnectBeltConnectComponentMoved
}//GEN-LAST:event_jLabelConnectBeltConnectComponentMoved

private void jLabelConnectBeltConnectMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelConnectBeltConnectMouseDragged
    jLabelConnectBeltConnect.setLocation(jLabelConnectBeltConnect.getX() + evt.getX(), jLabelConnectBeltConnect.getY());
    if (jLabelConnectBeltConnect.getX() >= jLabelConnectBeltConnectStop.getX()) {
        setContentPane(jPanelHome);
        try {
            echoSocket = new Socket(host, 4444); // pc-naam of ip-adres
            out = new PrintWriter(echoSocket.getOutputStream(), true);
            in = new BufferedReader(new InputStreamReader(
                    echoSocket.getInputStream()));
        } catch (UnknownHostException e) {
            JOptionPane.showMessageDialog(this, "Don't know about host" + host);
            //System.err.println("Don't know about host" + host);
            System.exit(1);
        } catch (IOException e) {
            JOptionPane.showMessageDialog(this, "Couldn't get I/O for " + "the connection to: " + host);
            // System.err.println("Couldn't get I/O for "   + "the connection to: " + host);
            System.exit(1);
        }
    }
}//GEN-LAST:event_jLabelConnectBeltConnectMouseDragged

private void jLabelHomeLichtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelHomeLichtMouseClicked
    setContentPane(jPanelLicht);
    jSliderLichtDim.setValue(Integer.parseInt(execute("@1 0")));
}//GEN-LAST:event_jLabelHomeLichtMouseClicked

private void jLabelHomeLichtMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelHomeLichtMouseEntered
    jLabelHomeLicht.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/screen/light.png")));
}//GEN-LAST:event_jLabelHomeLichtMouseEntered

private void jLabelHomeLichtMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelHomeLichtMouseExited
    jLabelHomeLicht.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/screen/lightdim.png")));
}//GEN-LAST:event_jLabelHomeLichtMouseExited

private void jLabelHomeWeatherMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelHomeWeatherMouseClicked
    setContentPane(jPanelTemp);
    jLabelTemp0.setText(execute("@2"));
    for (int i = 1; i < 5; i++) {
        switch (i) {
            case 1:
                jLabelTemp1.setText(execute("@4 " + (i - 1)));
                break;
            case 2:
                jLabelTemp2.setText(execute("@4 " + (i - 1)));
                break;
            case 3:
                jLabelTemp3.setText(execute("@4 " + (i - 1)));
                break;
            case 4:
                jLabelTemp4.setText(execute("@4 " + (i - 1)));
                break;
        }
    }
}//GEN-LAST:event_jLabelHomeWeatherMouseClicked

private void jLabelHomeWeatherMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelHomeWeatherMouseEntered
    jLabelHomeWeather.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/screen/weather.png")));
}//GEN-LAST:event_jLabelHomeWeatherMouseEntered

private void jLabelHomeWeatherMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelHomeWeatherMouseExited
    jLabelHomeWeather.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/screen/weatherdim.png")));
}//GEN-LAST:event_jLabelHomeWeatherMouseExited

private void jLabelHomeSecurityMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelHomeSecurityMouseClicked
    setContentPane(jPanelSecurity);
}//GEN-LAST:event_jLabelHomeSecurityMouseClicked

private void jLabelHomeSecurityMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelHomeSecurityMouseEntered
    jLabelHomeSecurity.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/screen/security.png")));
}//GEN-LAST:event_jLabelHomeSecurityMouseEntered

private void jLabelHomeSecurityMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelHomeSecurityMouseExited
    jLabelHomeSecurity.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/screen/securitydim.png")));
}//GEN-LAST:event_jLabelHomeSecurityMouseExited

private void jLabelHomeMusicMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelHomeMusicMouseClicked
    setContentPane(jPanelMusic);
}//GEN-LAST:event_jLabelHomeMusicMouseClicked

private void jLabelHomeMusicMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelHomeMusicMouseEntered
    jLabelHomeMusic.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/screen/music.png")));
}//GEN-LAST:event_jLabelHomeMusicMouseEntered

private void jLabelHomeMusicMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelHomeMusicMouseExited
    jLabelHomeMusic.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/screen/musicdim.png")));
}//GEN-LAST:event_jLabelHomeMusicMouseExited

private void jLabelSecurity1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelSecurity1MouseClicked
    jTextFieldSecurityCode.setText(jTextFieldSecurityCode.getText() + "* ");
    code += "1";
}//GEN-LAST:event_jLabelSecurity1MouseClicked

private void jLabelSecurity1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelSecurity1MouseEntered
    jLabelSecurity1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/security/one.png")));
}//GEN-LAST:event_jLabelSecurity1MouseEntered

private void jLabelSecurity1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelSecurity1MouseExited
    jLabelSecurity1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/security/onedim.png")));
}//GEN-LAST:event_jLabelSecurity1MouseExited

private void jLabelSecurity2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelSecurity2MouseClicked
    jTextFieldSecurityCode.setText(jTextFieldSecurityCode.getText() + "* ");
    code += "2";
}//GEN-LAST:event_jLabelSecurity2MouseClicked

private void jLabelSecurity2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelSecurity2MouseEntered
    jLabelSecurity2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/security/two.png")));
}//GEN-LAST:event_jLabelSecurity2MouseEntered

private void jLabelSecurity2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelSecurity2MouseExited
    jLabelSecurity2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/security/twodim.png")));
}//GEN-LAST:event_jLabelSecurity2MouseExited

private void jLabelSecurity3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelSecurity3MouseClicked
    jTextFieldSecurityCode.setText(jTextFieldSecurityCode.getText() + "* ");
    code += "3";
}//GEN-LAST:event_jLabelSecurity3MouseClicked

private void jLabelSecurity3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelSecurity3MouseEntered
    jLabelSecurity3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/security/three.png")));
}//GEN-LAST:event_jLabelSecurity3MouseEntered

private void jLabelSecurity3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelSecurity3MouseExited
    jLabelSecurity3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/security/threedim.png")));
}//GEN-LAST:event_jLabelSecurity3MouseExited

private void jLabelSecurity4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelSecurity4MouseClicked
    jTextFieldSecurityCode.setText(jTextFieldSecurityCode.getText() + "* ");
    code += "4";
}//GEN-LAST:event_jLabelSecurity4MouseClicked

private void jLabelSecurity4MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelSecurity4MouseEntered
    jLabelSecurity4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/security/four.png")));
}//GEN-LAST:event_jLabelSecurity4MouseEntered

private void jLabelSecurity4MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelSecurity4MouseExited
    jLabelSecurity4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/security/fourdim.png")));
}//GEN-LAST:event_jLabelSecurity4MouseExited

private void jLabelSecurity5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelSecurity5MouseClicked
    jTextFieldSecurityCode.setText(jTextFieldSecurityCode.getText() + "* ");
    code += "5";
}//GEN-LAST:event_jLabelSecurity5MouseClicked

private void jLabelSecurity5MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelSecurity5MouseEntered
    jLabelSecurity5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/security/five.png")));
}//GEN-LAST:event_jLabelSecurity5MouseEntered

private void jLabelSecurity5MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelSecurity5MouseExited
    jLabelSecurity5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/security/fivedim.png")));
}//GEN-LAST:event_jLabelSecurity5MouseExited

private void jLabelSecurity6MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelSecurity6MouseEntered
    jLabelSecurity6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/security/six.png")));
}//GEN-LAST:event_jLabelSecurity6MouseEntered

private void jLabelSecurity6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelSecurity6MouseClicked
    jTextFieldSecurityCode.setText(jTextFieldSecurityCode.getText() + "* ");
    code += "6";
}//GEN-LAST:event_jLabelSecurity6MouseClicked

private void jLabelSecurity6MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelSecurity6MouseExited
    jLabelSecurity6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/security/sixdim.png")));
}//GEN-LAST:event_jLabelSecurity6MouseExited

private void jLabelSecurity7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelSecurity7MouseClicked
    jTextFieldSecurityCode.setText(jTextFieldSecurityCode.getText() + "* ");
    code += "7";
}//GEN-LAST:event_jLabelSecurity7MouseClicked

private void jLabelSecurity7MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelSecurity7MouseEntered
    jLabelSecurity7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/security/seven.png")));
}//GEN-LAST:event_jLabelSecurity7MouseEntered

private void jLabelSecurity7MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelSecurity7MouseExited
    jLabelSecurity7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/security/sevendim.png")));
}//GEN-LAST:event_jLabelSecurity7MouseExited

private void jLabelSecurity8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelSecurity8MouseClicked
    jTextFieldSecurityCode.setText(jTextFieldSecurityCode.getText() + "* ");
    code += "8";
}//GEN-LAST:event_jLabelSecurity8MouseClicked

private void jLabelSecurity8MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelSecurity8MouseEntered
    jLabelSecurity8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/security/eight.png")));
}//GEN-LAST:event_jLabelSecurity8MouseEntered

private void jLabelSecurity8MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelSecurity8MouseExited
    jLabelSecurity8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/security/eightdim.png")));
}//GEN-LAST:event_jLabelSecurity8MouseExited

private void jLabelSecurity9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelSecurity9MouseClicked
    jTextFieldSecurityCode.setText(jTextFieldSecurityCode.getText() + "* ");
    code += "9";
}//GEN-LAST:event_jLabelSecurity9MouseClicked

private void jLabelSecurity9MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelSecurity9MouseEntered
    jLabelSecurity9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/security/nine.png")));
}//GEN-LAST:event_jLabelSecurity9MouseEntered

private void jLabelSecurity9MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelSecurity9MouseExited
    jLabelSecurity9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/security/ninedim.png")));
}//GEN-LAST:event_jLabelSecurity9MouseExited

private void jLabelSecurityOkMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelSecurityOkMouseClicked
    if (code.equals(password)) {
        setContentPane(jPanelSecurityAcces);
        for (int i = 0; i < 4; i++) {
            if (execute("@3 " + i).equals("true")) {
                switch (i) {
                    case 0:
                        jLabelSecuritySliderButton.setLocation(jLabelSecurityStop.getX() - 1, jLabelSecuritySliderButton.getY());
                        jLabelSecurityLock.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/security/lockopen.png")));
                        break;
                    case 1:
                        jLabelSecuritySliderButton2.setLocation(jLabelSecurityStop2.getX() - 1, jLabelSecuritySliderButton2.getY());
                        jLabelSecurityLock2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/security/lockopen.png")));
                        break;
                    case 3:
                        jLabelSecuritySliderButton1.setLocation(jLabelSecurityStop1.getX() - 1, jLabelSecuritySliderButton1.getY());
                        jLabelSecurityLock1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/security/lockopen.png")));
                        break;
                }
            }
        }
    } else {
        JOptionPane.showMessageDialog(this, "The password is incorrect. Please try again.");
        jTextFieldSecurityCode.setText("");
        code = "";
    }
}//GEN-LAST:event_jLabelSecurityOkMouseClicked

private void jLabelSecurityOkMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelSecurityOkMouseEntered
    jLabelSecurityOk.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/security/OKbutton.png")));
}//GEN-LAST:event_jLabelSecurityOkMouseEntered

private void jLabelSecurityOkMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelSecurityOkMouseExited
    jLabelSecurityOk.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/security/OKbuttondim.png")));
}//GEN-LAST:event_jLabelSecurityOkMouseExited

private void jLabelSecurity0MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelSecurity0MouseClicked
    jTextFieldSecurityCode.setText(jTextFieldSecurityCode.getText() + "* ");
    code += "0";
}//GEN-LAST:event_jLabelSecurity0MouseClicked

private void jLabelSecurity0MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelSecurity0MouseEntered
    jLabelSecurity0.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/security/null.png")));
}//GEN-LAST:event_jLabelSecurity0MouseEntered

private void jLabelSecurity0MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelSecurity0MouseExited
    jLabelSecurity0.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/security/nulldim.png")));
}//GEN-LAST:event_jLabelSecurity0MouseExited

private void jLabelSecurityResetMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelSecurityResetMouseClicked
    jTextFieldSecurityCode.setText("");
    code = "";
}//GEN-LAST:event_jLabelSecurityResetMouseClicked

private void jLabelSecurityResetMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelSecurityResetMouseExited
    jLabelSecurityReset.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/security/resetdim.png")));
}//GEN-LAST:event_jLabelSecurityResetMouseExited

private void jLabelSecurityResetMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelSecurityResetMouseEntered
    jLabelSecurityReset.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/security/reset.png")));
}//GEN-LAST:event_jLabelSecurityResetMouseEntered

private void jLabelSecurityBackMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelSecurityBackMouseClicked
    setContentPane(jPanelHome);
}//GEN-LAST:event_jLabelSecurityBackMouseClicked

private void jLabelSecurityAccesBackMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelSecurityAccesBackMouseClicked
    setContentPane(jPanelHome);
}//GEN-LAST:event_jLabelSecurityAccesBackMouseClicked

private void jLabelMusicBackMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelMusicBackMouseClicked
    setContentPane(jPanelHome);
}//GEN-LAST:event_jLabelMusicBackMouseClicked

private void jLabelTempBackMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelTempBackMouseClicked
    setContentPane(jPanelHome);
}//GEN-LAST:event_jLabelTempBackMouseClicked

private void jLabelLichtBackMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelLichtBackMouseClicked
    setContentPane(jPanelHome);
}//GEN-LAST:event_jLabelLichtBackMouseClicked

private void jLabelSecuritySliderButtonMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelSecuritySliderButtonMouseDragged
    if (jLabelSecuritySliderButton.getX() + evt.getX() > jLabelSecurityBegin.getX()) {
        if ((jLabelSecuritySliderButton.getX() + evt.getX()) < jLabelSecurityStop.getX()) {
            jLabelSecuritySliderButton.setLocation(jLabelSecuritySliderButton.getX() + evt.getX(), jLabelSecuritySliderButton.getY());
        }
    }
    if (jLabelSecuritySliderButton.getX() + evt.getX() > jLabelSecurityStop.getX() - 5) {
        jLabelSecurityLock.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/security/lockopen.png")));
        if (execute("@3 0").equals("false")) {
            execute("&3 0");
        }
    }
    if ((jLabelSecuritySliderButton.getX() + evt.getX()) < jLabelSecurityBegin.getX() - 5) {
        jLabelSecurityLock.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/security/lockclose.png")));
        if (execute("@3 0").equals("true")) {
            execute("&3 0");
        }
    }
}//GEN-LAST:event_jLabelSecuritySliderButtonMouseDragged

private void jLabelSecuritySliderButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelSecuritySliderButtonMouseEntered
    jLabelSecuritySliderButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/security/sliderlockbutton.png")));
}//GEN-LAST:event_jLabelSecuritySliderButtonMouseEntered

private void jLabelSecuritySliderButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelSecuritySliderButtonMouseExited
    jLabelSecuritySliderButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/security/sliderlockbuttondim.png")));
}//GEN-LAST:event_jLabelSecuritySliderButtonMouseExited

private void jLabelMusicPlusMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelMusicPlusMouseExited
    jLabelMusicPlus.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/music/plusdim.png")));
}//GEN-LAST:event_jLabelMusicPlusMouseExited

private void jLabelMusicPlusMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelMusicPlusMouseEntered
    jLabelMusicPlus.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/music/plus.png")));
}//GEN-LAST:event_jLabelMusicPlusMouseEntered

private void jLabelMusicPlusMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelMusicPlusMouseClicked
    if (volume[0] < 5) {
        jLabelMusicVolume.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/music/volume" + (volume[0] += 1) + ".png")));
    }
}//GEN-LAST:event_jLabelMusicPlusMouseClicked

private void jLabelMusicPlus1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelMusicPlus1MouseExited
    jLabelMusicPlus1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/music/plusdim.png")));
}//GEN-LAST:event_jLabelMusicPlus1MouseExited

private void jLabelMusicPlus1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelMusicPlus1MouseEntered
    jLabelMusicPlus1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/music/plus.png")));
}//GEN-LAST:event_jLabelMusicPlus1MouseEntered

private void jLabelMusicPlus1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelMusicPlus1MouseClicked
    if (volume[1] < 5) {
        jLabelMusicVolume1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/music/volume" + (volume[1] += 1) + ".png")));
    }
}//GEN-LAST:event_jLabelMusicPlus1MouseClicked

private void jLabelMusicPlus2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelMusicPlus2MouseExited
    jLabelMusicPlus2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/music/plusdim.png")));
}//GEN-LAST:event_jLabelMusicPlus2MouseExited

private void jLabelMusicPlus2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelMusicPlus2MouseEntered
    jLabelMusicPlus2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/music/plus.png")));
}//GEN-LAST:event_jLabelMusicPlus2MouseEntered

private void jLabelMusicPlus2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelMusicPlus2MouseClicked
    if (volume[2] < 5) {
        jLabelMusicVolume2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/music/volume" + (volume[2] += 1) + ".png")));
    }
}//GEN-LAST:event_jLabelMusicPlus2MouseClicked

private void jLabelMusicMin2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelMusicMin2MouseExited
    jLabelMusicMin2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/music/mindim.png")));
}//GEN-LAST:event_jLabelMusicMin2MouseExited

private void jLabelMusicMin2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelMusicMin2MouseEntered
    jLabelMusicMin2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/music/min.png")));
}//GEN-LAST:event_jLabelMusicMin2MouseEntered

private void jLabelMusicMin2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelMusicMin2MouseClicked
    if (volume[2] > 0) {
        jLabelMusicVolume2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/music/volume" + (volume[2] -= 1) + ".png")));
    }
}//GEN-LAST:event_jLabelMusicMin2MouseClicked

private void jLabelMusicMin1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelMusicMin1MouseExited
    jLabelMusicMin1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/music/mindim.png")));
}//GEN-LAST:event_jLabelMusicMin1MouseExited

private void jLabelMusicMin1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelMusicMin1MouseEntered
    jLabelMusicMin1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/music/min.png")));
}//GEN-LAST:event_jLabelMusicMin1MouseEntered

private void jLabelMusicMin1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelMusicMin1MouseClicked
    if (volume[1] > 0) {
        jLabelMusicVolume1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/music/volume" + (volume[1] -= 1) + ".png")));
    }
}//GEN-LAST:event_jLabelMusicMin1MouseClicked

private void jLabelMusicMinMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelMusicMinMouseExited
    jLabelMusicMin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/music/mindim.png")));

}//GEN-LAST:event_jLabelMusicMinMouseExited

private void jLabelMusicMinMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelMusicMinMouseEntered
    jLabelMusicMin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/music/min.png")));

}//GEN-LAST:event_jLabelMusicMinMouseEntered

private void jLabelMusicMinMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelMusicMinMouseClicked
    if (volume[0] > 0) {
        jLabelMusicVolume.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/music/volume" + (volume[0] -= 1) + ".png")));
    }
}//GEN-LAST:event_jLabelMusicMinMouseClicked

private void jLabelSecuritySliderButton1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelSecuritySliderButton1MouseEntered
    jLabelSecuritySliderButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/security/sliderlockbutton.png")));
}//GEN-LAST:event_jLabelSecuritySliderButton1MouseEntered

private void jLabelSecuritySliderButton1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelSecuritySliderButton1MouseExited
    jLabelSecuritySliderButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/security/sliderlockbuttondim.png")));
}//GEN-LAST:event_jLabelSecuritySliderButton1MouseExited

private void jLabelSecuritySliderButton1MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelSecuritySliderButton1MouseDragged
    if (jLabelSecuritySliderButton1.getX() + evt.getX() > jLabelSecurityBegin1.getX()) {
        if ((jLabelSecuritySliderButton1.getX() + evt.getX()) < jLabelSecurityStop1.getX()) {
            jLabelSecuritySliderButton1.setLocation(jLabelSecuritySliderButton1.getX() + evt.getX(), jLabelSecuritySliderButton1.getY());
        }
    }
    if (jLabelSecuritySliderButton1.getX() + evt.getX() > jLabelSecurityStop1.getX() - 5) {
        jLabelSecurityLock1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/security/lockopen.png")));
        if (execute("@3 3").equals("false")) {
            execute("&3 3");
        }
    }
    if ((jLabelSecuritySliderButton1.getX() + evt.getX()) < jLabelSecurityBegin1.getX() - 5) {
        jLabelSecurityLock1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/security/lockclose.png")));
        if (execute("@3 3").equals("true")) {
            execute("&3 3");
        }
    }
}//GEN-LAST:event_jLabelSecuritySliderButton1MouseDragged

private void jLabelSecuritySliderButton2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelSecuritySliderButton2MouseEntered
    jLabelSecuritySliderButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/security/sliderlockbutton.png")));
}//GEN-LAST:event_jLabelSecuritySliderButton2MouseEntered

private void jLabelSecuritySliderButton2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelSecuritySliderButton2MouseExited
    jLabelSecuritySliderButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/security/sliderlockbuttondim.png")));
}//GEN-LAST:event_jLabelSecuritySliderButton2MouseExited

private void jLabelSecuritySliderButton2MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelSecuritySliderButton2MouseDragged
    if (jLabelSecuritySliderButton2.getX() + evt.getX() > jLabelSecurityBegin2.getX()) {
        if ((jLabelSecuritySliderButton2.getX() + evt.getX()) < jLabelSecurityStop2.getX()) {
            jLabelSecuritySliderButton2.setLocation(jLabelSecuritySliderButton2.getX() + evt.getX(), jLabelSecuritySliderButton2.getY());
        }
    }
    if (jLabelSecuritySliderButton2.getX() + evt.getX() > jLabelSecurityStop2.getX() - 5) {
        jLabelSecurityLock2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/security/lockopen.png")));
        if (execute("@3 1").equals("false")) {
            execute("&3 1");
        }
        if (execute("@3 4").equals("false")) {
            execute("&3 4");
        }
    }
    if ((jLabelSecuritySliderButton2.getX() + evt.getX()) < jLabelSecurityBegin2.getX() - 5) {
        jLabelSecurityLock2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/security/lockclose.png")));
        if (execute("@3 1").equals("true")) {
            execute("&3 1");
        }
        if (execute("@3 4").equals("true")) {
            execute("&3 4");
        }
    }
}//GEN-LAST:event_jLabelSecuritySliderButton2MouseDragged

private void jLabelLichtKitchenMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelLichtKitchenMouseClicked
    room = 0;
    jSliderLichtDim.setValue(Integer.parseInt(execute("@1 " + room * 4)));
}//GEN-LAST:event_jLabelLichtKitchenMouseClicked

private void jLabelLichtLivingMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelLichtLivingMouseClicked
    room = 1;
    jSliderLichtDim.setValue(Integer.parseInt(execute("@1 " + room * 4)));
}//GEN-LAST:event_jLabelLichtLivingMouseClicked

private void jLabelLichtBedMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelLichtBedMouseClicked
    room = 2;
    jSliderLichtDim.setValue(Integer.parseInt(execute("@1 " + room * 4)));
}//GEN-LAST:event_jLabelLichtBedMouseClicked

private void jLabelLichtBathMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelLichtBathMouseClicked
    room = 3;
    jSliderLichtDim.setValue(Integer.parseInt(execute("@1 " + room * 4)));
}//GEN-LAST:event_jLabelLichtBathMouseClicked

private void jLabelLichtHomeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelLichtHomeMouseClicked
    setContentPane(jPanelHome);
}//GEN-LAST:event_jLabelLichtHomeMouseClicked

    public String execute(String commando) {
        String terug = "";
        out.println(commando);
        try {
            terug = in.readLine();
        } catch (IOException ex) {
            Logger.getLogger(JFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
        return terug;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(JFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new JFrame().setVisible(true);

            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabelConnectBackground;
    private javax.swing.JLabel jLabelConnectBelt;
    private javax.swing.JLabel jLabelConnectBeltConnect;
    private javax.swing.JLabel jLabelConnectBeltConnectStop;
    private javax.swing.JLabel jLabelConnectLichtDisabled;
    private javax.swing.JLabel jLabelConnectMusicDisabled;
    private javax.swing.JLabel jLabelConnectSecurityDisabled;
    private javax.swing.JLabel jLabelConnectTime;
    private javax.swing.JLabel jLabelConnectWeatherDisabled;
    private javax.swing.JLabel jLabelHomeBackground;
    private javax.swing.JLabel jLabelHomeCredit;
    private javax.swing.JLabel jLabelHomeLicht;
    private javax.swing.JLabel jLabelHomeMusic;
    private javax.swing.JLabel jLabelHomeSecurity;
    private javax.swing.JLabel jLabelHomeWeather;
    private javax.swing.JLabel jLabelLichtBack;
    private javax.swing.JLabel jLabelLichtBackground;
    private javax.swing.JLabel jLabelLichtBath;
    private javax.swing.JLabel jLabelLichtBed;
    private javax.swing.JLabel jLabelLichtHome;
    private javax.swing.JLabel jLabelLichtKitchen;
    private javax.swing.JLabel jLabelLichtLicht;
    private javax.swing.JLabel jLabelLichtLiving;
    private javax.swing.JLabel jLabelLichtTime;
    private javax.swing.JLabel jLabelMusicBack;
    private javax.swing.JLabel jLabelMusicBackground;
    private javax.swing.JLabel jLabelMusicMin;
    private javax.swing.JLabel jLabelMusicMin1;
    private javax.swing.JLabel jLabelMusicMin2;
    private javax.swing.JLabel jLabelMusicPlus;
    private javax.swing.JLabel jLabelMusicPlus1;
    private javax.swing.JLabel jLabelMusicPlus2;
    private javax.swing.JLabel jLabelMusicRoom;
    private javax.swing.JLabel jLabelMusicRoom1;
    private javax.swing.JLabel jLabelMusicRoom2;
    private javax.swing.JLabel jLabelMusicTime;
    private javax.swing.JLabel jLabelMusicVolume;
    private javax.swing.JLabel jLabelMusicVolume1;
    private javax.swing.JLabel jLabelMusicVolume2;
    private javax.swing.JLabel jLabelSecurity0;
    private javax.swing.JLabel jLabelSecurity1;
    private javax.swing.JLabel jLabelSecurity2;
    private javax.swing.JLabel jLabelSecurity3;
    private javax.swing.JLabel jLabelSecurity4;
    private javax.swing.JLabel jLabelSecurity5;
    private javax.swing.JLabel jLabelSecurity6;
    private javax.swing.JLabel jLabelSecurity7;
    private javax.swing.JLabel jLabelSecurity8;
    private javax.swing.JLabel jLabelSecurity9;
    private javax.swing.JLabel jLabelSecurityAccesBack;
    private javax.swing.JLabel jLabelSecurityAccesBackground;
    private javax.swing.JLabel jLabelSecurityAccesTime;
    private javax.swing.JLabel jLabelSecurityBG;
    private javax.swing.JLabel jLabelSecurityBG1;
    private javax.swing.JLabel jLabelSecurityBG2;
    private javax.swing.JLabel jLabelSecurityBack;
    private javax.swing.JLabel jLabelSecurityBackground;
    private javax.swing.JLabel jLabelSecurityBegin;
    private javax.swing.JLabel jLabelSecurityBegin1;
    private javax.swing.JLabel jLabelSecurityBegin2;
    private javax.swing.JLabel jLabelSecurityCode;
    private javax.swing.JLabel jLabelSecurityLock;
    private javax.swing.JLabel jLabelSecurityLock1;
    private javax.swing.JLabel jLabelSecurityLock2;
    private javax.swing.JLabel jLabelSecurityLogo;
    private javax.swing.JLabel jLabelSecurityLogo1;
    private javax.swing.JLabel jLabelSecurityLogo2;
    private javax.swing.JLabel jLabelSecurityOk;
    private javax.swing.JLabel jLabelSecurityReset;
    private javax.swing.JLabel jLabelSecuritySlideToUnlock;
    private javax.swing.JLabel jLabelSecuritySlideToUnlock1;
    private javax.swing.JLabel jLabelSecuritySlideToUnlock2;
    private javax.swing.JLabel jLabelSecuritySliderButton;
    private javax.swing.JLabel jLabelSecuritySliderButton1;
    private javax.swing.JLabel jLabelSecuritySliderButton2;
    private javax.swing.JLabel jLabelSecurityStop;
    private javax.swing.JLabel jLabelSecurityStop1;
    private javax.swing.JLabel jLabelSecurityStop2;
    private javax.swing.JLabel jLabelSecurityTime;
    private javax.swing.JLabel jLabelTemp;
    private javax.swing.JLabel jLabelTemp0;
    private javax.swing.JLabel jLabelTemp1;
    private javax.swing.JLabel jLabelTemp2;
    private javax.swing.JLabel jLabelTemp3;
    private javax.swing.JLabel jLabelTemp4;
    private javax.swing.JLabel jLabelTempBack;
    private javax.swing.JLabel jLabelTempBackground;
    private javax.swing.JLabel jLabelTempBath;
    private javax.swing.JLabel jLabelTempBed;
    private javax.swing.JLabel jLabelTempKitchen;
    private javax.swing.JLabel jLabelTempLiving;
    private javax.swing.JLabel jLabelTempTime;
    private javax.swing.JPanel jPanelConnect;
    private javax.swing.JPanel jPanelConnectBelt;
    private javax.swing.JPanel jPanelConnectButtonDisabled;
    private javax.swing.JPanel jPanelHome;
    private javax.swing.JPanel jPanelHomeButton;
    private javax.swing.JPanel jPanelLicht;
    private javax.swing.JPanel jPanelMusic;
    private javax.swing.JPanel jPanelMusicVolume;
    private javax.swing.JPanel jPanelSecurity;
    private javax.swing.JPanel jPanelSecurityAcces;
    private javax.swing.JPanel jPanelSecuritySlider;
    private javax.swing.JPanel jPanelSecuritySlider1;
    private javax.swing.JPanel jPanelSecuritySlider2;
    private javax.swing.JPanel jPanelTemp;
    private javax.swing.JSlider jSliderLichtDim;
    private javax.swing.JSlider jSliderTempDim;
    private javax.swing.JPanel jTextFieldSecurityButton;
    private javax.swing.JTextField jTextFieldSecurityCode;
    // End of variables declaration//GEN-END:variables
}
