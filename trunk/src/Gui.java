import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

import javax.swing.JFileChooser;


/*
 * TGui.java
 *
 * Created on __DATE__, __TIME__
 */


/**
 *
 * @author  __USER__
 */
public class Gui extends javax.swing.JFrame {

	/**
	 * 
	 */
	//private static final long serialVersionUID = 1L;
	Tomasulo t;
	
	/** Creates new form TGui */
	public Gui() {
		t = new Tomasulo();
		initComponents();
	}

	private javax.swing.JButton jButton1;
	private javax.swing.JButton jButton2;
	private javax.swing.JButton jButton3;
	private javax.swing.JButton jButton4;
	private javax.swing.JButton jButton5;
	private javax.swing.JButton jButton6;
	private javax.swing.JLabel jLabel6;
	private javax.swing.JLabel jLabel7;
	private javax.swing.JLabel jLabel1;
	private javax.swing.JLabel jLabel2;
	private javax.swing.JLabel jLabel3;
	private javax.swing.JLabel jLabel4;
	private javax.swing.JLabel jLabel5;
	private javax.swing.JLabel jLabel8;
	private javax.swing.JLabel jLabel9;
	private javax.swing.JLabel jLabel10;
	private javax.swing.JLabel jLabel11;
	private javax.swing.JPanel jPanel1;
	private javax.swing.JPanel jPanel2;
	private javax.swing.JScrollPane jScrollPane1;
	private javax.swing.JScrollPane jScrollPane2;
	private javax.swing.JScrollPane jScrollPane3;
	private javax.swing.JScrollPane jScrollPane4;
	private javax.swing.JScrollPane jScrollPane5;
	private javax.swing.JTable jTable1;
	private javax.swing.JTable jTable2;
	private javax.swing.JTable jTable3;
	private javax.swing.JTable jTable4;
	private javax.swing.JTable jTable5;
	private javax.swing.JTextField jTextField1;
	private javax.swing.JTextField jTextField2;
	private javax.swing.JTextField jTextField3;
	private javax.swing.JTextField jTextField4;
	private javax.swing.JTextField jTextField6;

	/** This method is called from within the constructor to
	 * initialize the form.
	 * WARNING: Do NOT modify this code. The content of this method is
	 * always regenerated by the Form Editor.
	 */
	//GEN-BEGIN:initComponents
	// <editor-fold defaultstate="collapsed" desc="Generated Code">
	private void initComponents() {

		jPanel1 = new javax.swing.JPanel();
		jPanel2 = new javax.swing.JPanel();
		jButton1 = new javax.swing.JButton();
		jButton2 = new javax.swing.JButton();
		jButton3 = new javax.swing.JButton();
		jLabel8 = new javax.swing.JLabel();
		jLabel9 = new javax.swing.JLabel();
		jLabel10 = new javax.swing.JLabel();
		jLabel11 = new javax.swing.JLabel();
		jScrollPane1 = new javax.swing.JScrollPane();
		jTable1 = new javax.swing.JTable();
		jScrollPane2 = new javax.swing.JScrollPane();
		jTable2 = new javax.swing.JTable();
		jScrollPane3 = new javax.swing.JScrollPane();
		jTable3 = new javax.swing.JTable();
		jTextField1 = new javax.swing.JTextField();
		jButton4 = new javax.swing.JButton();
		jTextField2 = new javax.swing.JTextField();
		jLabel1 = new javax.swing.JLabel();
		jButton5 = new javax.swing.JButton();
		jTextField3 = new javax.swing.JTextField();
		jTextField4 = new javax.swing.JTextField();
		jLabel2 = new javax.swing.JLabel();
		jTextField6 = new javax.swing.JTextField();
		jButton6 = new javax.swing.JButton();
		jLabel3 = new javax.swing.JLabel();
		jLabel4 = new javax.swing.JLabel();
		jLabel5 = new javax.swing.JLabel();
		jScrollPane4 = new javax.swing.JScrollPane();
		jTable4 = new javax.swing.JTable();
		jScrollPane5 = new javax.swing.JScrollPane();
		jTable5 = new javax.swing.JTable();
		jLabel6 = new javax.swing.JLabel();
		jLabel7 = new javax.swing.JLabel();

		setDefaultCloseOperation(3);

		jButton1.setText("载入文件");
		jButton1.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton1ActionPerformed(evt);
			}
		});

		jButton2.setText("全部执行");
		jButton2.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton2ActionPerformed(evt);
			}
		});

		jButton3.setText("单步执行");
		jButton3.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton3ActionPerformed(evt);
			}
		});

		jLabel8.setText("clock =");

		jLabel9.setText("0");

		jLabel10.setText("pc =");

		jLabel11.setText("0");

		org.jdesktop.layout.GroupLayout jPanel2Layout = new org.jdesktop.layout.GroupLayout(
				jPanel2);
		jPanel2.setLayout(jPanel2Layout);
		jPanel2Layout
				.setHorizontalGroup(jPanel2Layout
						.createParallelGroup(
								org.jdesktop.layout.GroupLayout.LEADING)
						.add(
								jPanel2Layout
										.createSequentialGroup()
										.add(jButton1)
										.add(27, 27, 27)
										.add(jButton2)
										.add(34, 34, 34)
										.add(jButton3)
										.add(48, 48, 48)
										.add(jLabel8)
										.addPreferredGap(
												org.jdesktop.layout.LayoutStyle.RELATED)
										.add(jLabel9)
										.add(47, 47, 47)
										.add(jLabel10)
										.addPreferredGap(
												org.jdesktop.layout.LayoutStyle.RELATED)
										.add(jLabel11).addContainerGap(189,
												Short.MAX_VALUE)));
		jPanel2Layout.setVerticalGroup(jPanel2Layout.createParallelGroup(
				org.jdesktop.layout.GroupLayout.LEADING).add(
				jPanel2Layout.createParallelGroup(
						org.jdesktop.layout.GroupLayout.BASELINE).add(jButton1)
						.add(jButton3).add(jButton2).add(jLabel8).add(jLabel9)
						.add(jLabel10).add(jLabel11)));

		jTable1.setModel(new javax.swing.table.DefaultTableModel(
				new Object[][] { { null, null, null, null },{ null, null, null, null },{ null, null, null, null },{ null, null, null, null },{ null, null, null, null },{ null, null, null, null },{ null, null, null, null },{ null, null, null, null },
						}, new String[] { "Inst Name", "Issue", "Exec Comp", "WB" }));
		jScrollPane1.setViewportView(jTable1);

		jTable2.setModel(new javax.swing.table.DefaultTableModel(
				new Object[][] { 
						{ "F0", null, null, null },{ "F1", null, null, null },{ "F2", null, null, null },{ "F3", null, null, null },{ "F4", null, null, null },{ "F5", null, null, null },{ "F6", null, null, null },{ "F7", null, null, null },
				}, new String[] { "Reg",
						"Data", "Busy", "station"}));
		jScrollPane2.setViewportView(jTable2);

		jTable3.setModel(new javax.swing.table.DefaultTableModel(
				new Object[][] { 
						{ null, null },	{ null, null },	{ null, null },	{ null, null },	{ null, null },	{ null, null },	{ null, null },	{ null, null },			
				}, new String[] { "Addr",
						"Data"}));
		jScrollPane3.setViewportView(jTable3);

		jTextField1.setText("");
		jTextField1.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jTextField1ActionPerformed(evt);
			}
		});

		jButton4.setText("输入指令");
		jButton4.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton4ActionPerformed(evt);
			}
		});

		jTextField2.setText("Reg");
		jTextField2.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jTextField2ActionPerformed(evt);
			}
		});

		jLabel1.setText("=");

		jButton5.setText("修改Reg");
		jButton5.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton5ActionPerformed(evt);
			}
		});

		jTextField3.setText("Value");
		jTextField3.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jTextField3ActionPerformed(evt);
			}
		});

		jTextField4.setText("Addr");
		jTextField4.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jTextField4ActionPerformed(evt);
			}
		});

		jLabel2.setText("=");

		jTextField6.setText("Value");
		jTextField6.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jTextField6ActionPerformed(evt);
			}
		});

		jButton6.setText("修改内存");
		jButton6.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton6ActionPerformed(evt);
			}
		});

		jLabel3.setText("\u6307\u4ee4\u961f\u5217");

		jLabel4.setText("\u5bc4\u5b58\u5668");

		jLabel5.setText("\u5185\u5b58");

		jTable4.setModel(new javax.swing.table.DefaultTableModel(
				new Object[][] { { "Load1", null, null, null },
						{ "Load2", null, null, null }, { "Load3", null, null, null },{ "Store1", null, null, null },{ "Store2", null, null, null },
						{ "Store3", null, null, null } }, new String[] { "",
						"Busy", "Addr", "Station" }));
		jScrollPane4.setViewportView(jTable4);

		jTable5.setModel(new javax.swing.table.DefaultTableModel(
				new Object[][] { 
						{ "Add1", null, null, null, null, null, null }, { "Add2", null, null, null, null, null, null },{ "Add3", null, null, null, null, null, null },{ "Mul1", null, null, null, null, null, null },{ "Mul2", null, null, null, null, null, null }
						}, new String[] { "",
						"Busy", "Op", "Data1", "Station1", "Data2", "Station2",}));
		jScrollPane5.setViewportView(jTable5);

		jLabel6.setText("Load/Store Queue");

		jLabel7.setText("Reservation Station");

		org.jdesktop.layout.GroupLayout jPanel1Layout = new org.jdesktop.layout.GroupLayout(
				jPanel1);
		jPanel1.setLayout(jPanel1Layout);
		jPanel1Layout
				.setHorizontalGroup(jPanel1Layout
						.createParallelGroup(
								org.jdesktop.layout.GroupLayout.LEADING)
						.add(
								jPanel1Layout
										.createSequentialGroup()
										.add(161, 161, 161)
										.add(jLabel3)
										.add(232, 232, 232)
										.add(jLabel4)
										.addPreferredGap(
												org.jdesktop.layout.LayoutStyle.RELATED,
												213, Short.MAX_VALUE).add(
												jLabel5).add(70, 70, 70))
						.add(
								jPanel1Layout
										.createSequentialGroup()
										.addContainerGap()
										.add(
												jPanel1Layout
														.createParallelGroup(
																org.jdesktop.layout.GroupLayout.LEADING)
														.add(
																jPanel1Layout
																		.createSequentialGroup()
																		.add(
																				jScrollPane4,
																				org.jdesktop.layout.GroupLayout.PREFERRED_SIZE,
																				249,
																				org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
																		.addPreferredGap(
																				org.jdesktop.layout.LayoutStyle.RELATED)
																		.add(
																				jScrollPane5,
																				org.jdesktop.layout.GroupLayout.PREFERRED_SIZE,
																				509,
																				org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
																		.addContainerGap())
														.add(
																jPanel1Layout
																		.createSequentialGroup()
																		.add(
																				70,
																				70,
																				70)
																		.add(
																				jLabel6)
																		.addPreferredGap(
																				org.jdesktop.layout.LayoutStyle.RELATED,
																				269,
																				Short.MAX_VALUE)
																		.add(
																				jLabel7)
																		.add(
																				225,
																				225,
																				225))))
						.add(
								jPanel1Layout
										.createSequentialGroup()
										.add(
												jPanel1Layout
														.createParallelGroup(
																org.jdesktop.layout.GroupLayout.LEADING)
														.add(
																jPanel1Layout
																		.createSequentialGroup()
																		.add(
																				10,
																				10,
																				10)
																		.add(
																				jPanel1Layout
																						.createParallelGroup(
																								org.jdesktop.layout.GroupLayout.LEADING)
																						.add(
																								jPanel2,
																								org.jdesktop.layout.GroupLayout.DEFAULT_SIZE,
																								org.jdesktop.layout.GroupLayout.DEFAULT_SIZE,
																								Short.MAX_VALUE)
																						.add(
																								jPanel1Layout
																										.createSequentialGroup()
																										.add(
																												jPanel1Layout
																														.createParallelGroup(
																																org.jdesktop.layout.GroupLayout.TRAILING)
																														.add(
																																jButton4)
																														.add(
																																jScrollPane1,
																																org.jdesktop.layout.GroupLayout.PREFERRED_SIZE,
																																318,
																																org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
																										.addPreferredGap(
																												org.jdesktop.layout.LayoutStyle.UNRELATED)
																										.add(
																												jPanel1Layout
																														.createParallelGroup(
																																org.jdesktop.layout.GroupLayout.LEADING)
																														.add(
																																jPanel1Layout
																																		.createSequentialGroup()
																																		.add(
																																				jTextField2,
																																				org.jdesktop.layout.GroupLayout.PREFERRED_SIZE,
																																				59,
																																				org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
																																		.addPreferredGap(
																																				org.jdesktop.layout.LayoutStyle.RELATED)
																																		.add(
																																				jLabel1)
																																		.addPreferredGap(
																																				org.jdesktop.layout.LayoutStyle.RELATED)
																																		.add(
																																				jTextField3,
																																				org.jdesktop.layout.GroupLayout.PREFERRED_SIZE,
																																				91,
																																				org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
																																		.addPreferredGap(
																																				org.jdesktop.layout.LayoutStyle.RELATED)
																																		.add(
																																				jButton5))
																														.add(
																																jScrollPane2,
																																0,
																																0,
																																Short.MAX_VALUE))
																										.add(
																												18,
																												18,
																												18)
																										.add(
																												jPanel1Layout
																														.createParallelGroup(
																																org.jdesktop.layout.GroupLayout.LEADING,
																																false)
																														.add(
																																jPanel1Layout
																																		.createSequentialGroup()
																																		.add(
																																				jTextField4,
																																				org.jdesktop.layout.GroupLayout.PREFERRED_SIZE,
																																				38,
																																				org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
																																		.addPreferredGap(
																																				org.jdesktop.layout.LayoutStyle.RELATED)
																																		.add(
																																				jLabel2)
																																		.addPreferredGap(
																																				org.jdesktop.layout.LayoutStyle.RELATED)
																																		.add(
																																				jTextField6,
																																				org.jdesktop.layout.GroupLayout.PREFERRED_SIZE,
																																				58,
																																				org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
																																		.addPreferredGap(
																																				org.jdesktop.layout.LayoutStyle.RELATED)
																																		.add(
																																				jButton6,
																																				10,
																																				10,
																																				Short.MAX_VALUE))
																														.add(
																																jScrollPane3,
																																org.jdesktop.layout.GroupLayout.PREFERRED_SIZE,
																																155,
																																org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
																										.addPreferredGap(
																												org.jdesktop.layout.LayoutStyle.RELATED,
																												4,
																												Short.MAX_VALUE))))
														.add(
																jPanel1Layout
																		.createSequentialGroup()
																		.addContainerGap()
																		.add(
																				jTextField1,
																				org.jdesktop.layout.GroupLayout.PREFERRED_SIZE,
																				230,
																				org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)))
										.add(18, 18, 18)));
		jPanel1Layout
				.setVerticalGroup(jPanel1Layout
						.createParallelGroup(
								org.jdesktop.layout.GroupLayout.LEADING)
						.add(
								jPanel1Layout
										.createSequentialGroup()
										.addContainerGap()
										.add(
												jPanel2,
												org.jdesktop.layout.GroupLayout.PREFERRED_SIZE,
												org.jdesktop.layout.GroupLayout.DEFAULT_SIZE,
												org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
										.add(21, 21, 21)
										.add(
												jPanel1Layout
														.createParallelGroup(
																org.jdesktop.layout.GroupLayout.BASELINE)
														.add(jLabel3).add(
																jLabel4).add(
																jLabel5))
										.addPreferredGap(
												org.jdesktop.layout.LayoutStyle.RELATED)
										.add(
												jPanel1Layout
														.createParallelGroup(
																org.jdesktop.layout.GroupLayout.LEADING,
																false)
														.add(jScrollPane3, 0,
																0,
																Short.MAX_VALUE)
														.add(jScrollPane2, 0,
																0,
																Short.MAX_VALUE)
														.add(
																jScrollPane1,
																org.jdesktop.layout.GroupLayout.DEFAULT_SIZE,
																221,
																Short.MAX_VALUE))
										.addPreferredGap(
												org.jdesktop.layout.LayoutStyle.RELATED,
												org.jdesktop.layout.GroupLayout.DEFAULT_SIZE,
												Short.MAX_VALUE)
										.add(
												jPanel1Layout
														.createParallelGroup(
																org.jdesktop.layout.GroupLayout.BASELINE)
														.add(jButton4)
														.add(
																jTextField1,
																org.jdesktop.layout.GroupLayout.PREFERRED_SIZE,
																org.jdesktop.layout.GroupLayout.DEFAULT_SIZE,
																org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
														.add(
																jTextField2,
																org.jdesktop.layout.GroupLayout.PREFERRED_SIZE,
																org.jdesktop.layout.GroupLayout.DEFAULT_SIZE,
																org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
														.add(jLabel1)
														.add(
																jTextField3,
																org.jdesktop.layout.GroupLayout.PREFERRED_SIZE,
																org.jdesktop.layout.GroupLayout.DEFAULT_SIZE,
																org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
														.add(jButton5)
														.add(
																jTextField4,
																org.jdesktop.layout.GroupLayout.PREFERRED_SIZE,
																org.jdesktop.layout.GroupLayout.DEFAULT_SIZE,
																org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
														.add(jLabel2)
														.add(
																jTextField6,
																org.jdesktop.layout.GroupLayout.PREFERRED_SIZE,
																org.jdesktop.layout.GroupLayout.DEFAULT_SIZE,
																org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
														.add(jButton6))
										.add(18, 18, 18)
										.add(
												jPanel1Layout
														.createParallelGroup(
																org.jdesktop.layout.GroupLayout.BASELINE)
														.add(jLabel6).add(
																jLabel7))
										.addPreferredGap(
												org.jdesktop.layout.LayoutStyle.RELATED)
										.add(
												jPanel1Layout
														.createParallelGroup(
																org.jdesktop.layout.GroupLayout.LEADING,
																false)
														.add(jScrollPane5, 0,
																0,
																Short.MAX_VALUE)
														.add(
																jScrollPane4,
																org.jdesktop.layout.GroupLayout.DEFAULT_SIZE,
																152,
																Short.MAX_VALUE))
										.addContainerGap()));

		org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(
				getContentPane());
		getContentPane().setLayout(layout);
		layout.setHorizontalGroup(layout.createParallelGroup(
				org.jdesktop.layout.GroupLayout.LEADING).add(jPanel1,
				org.jdesktop.layout.GroupLayout.PREFERRED_SIZE,
				org.jdesktop.layout.GroupLayout.DEFAULT_SIZE,
				org.jdesktop.layout.GroupLayout.PREFERRED_SIZE));
		layout.setVerticalGroup(layout.createParallelGroup(
				org.jdesktop.layout.GroupLayout.LEADING).add(
				org.jdesktop.layout.GroupLayout.TRAILING, jPanel1,
				org.jdesktop.layout.GroupLayout.DEFAULT_SIZE,
				org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE));

		pack();
	}// </editor-fold>
	//GEN-END:initComponents
	
	public void setTable1(){
		Object [][] content = new Object[t.instList.size()][4];
		for (int i = 0; i < t.instList.size(); i++){
			content[i][0] = t.instList.get(i).name;
			content[i][1] = (t.instList.get(i).issue == 0) ? "" : t.instList.get(i).issue;
			content[i][2] = (t.instList.get(i).execComp == 0) ? "" : t.instList.get(i).execComp;
			content[i][3] = (t.instList.get(i).writeback == 0) ? "" : t.instList.get(i).writeback;
		}
		jTable1.setModel(new javax.swing.table.DefaultTableModel(
				content , new String[] { "Inst Name", "Issue", "Exec Comp", "WB" }));
	}
	
	public void setTable2(){
		float data;
		int station;
		for (int i=0; i<Global.RegisterNum; i++){
			data = t.register.read(i);
//			if ((data = t.register.read(i)) != 0f)
				jTable2.setValueAt(data, i, 1);
			if (t.register.isBusy(i)){
				jTable2.setValueAt("yes", i, 2);
			} else {
				jTable2.setValueAt("no", i, 2);
			}
			if ((station = t.register.getStation(i)) != -1){
				jTable2.setValueAt(Global.getStationName(station), i, 3);
			}
		}
	}

	public void setTable3(int addr, float value){
		t.mem.mem[addr] = value;
		int flag = 0;
		for (int i = 0; i < 8; i ++){
			if (jTable3.getValueAt(i, 0) != null){
				if (addr == Integer.parseInt(jTable3.getValueAt(i, 0).toString())){
					jTable3.setValueAt(addr, i, 0);
					jTable3.setValueAt(value, i, 1);
					flag = 1;
				}
			}
		}
		
		if (flag == 0){
			int i = 0;
			for (i = 0; i < 8; i ++){
				if (jTable3.getValueAt(i, 0) == null)
					break;
			}
			if (i == 8) i = 0;
			jTable3.setValueAt(addr, i, 0);
			jTable3.setValueAt(value,i, 1);
		}
	}
	
	public void setTable4(){
		int station;
		for (int i=0; i<Global.LSQNum; i++){
			if (t.lsqueue.isBusy(i)){
				jTable4.setValueAt("yes", i, 1);
				jTable4.setValueAt(t.lsqueue.getAddr(i), i, 2);
			} else {
				jTable4.setValueAt("no", i, 1);
				jTable4.setValueAt("", i, 2);
			}
			if ((station = t.register.getStation(i)) != -1){
				jTable4.setValueAt(Global.getStationName(station), i, 3);
			}
			else {
				jTable4.setValueAt("", i, 3);
			}
		}
	}
	
	public void clearAllTable(){
		
		for (int k = 0; k < 8; k++){
			for (int j = 1; j < 4; j++){
				jTable2.setValueAt("", k, j);
			}
		}
		
		for (int k = 0; k < 6; k++){
			for (int j = 1; j < 3; j++){
				jTable4.setValueAt("", k, j);
			}
		}
		
		for (int k = 0; k < 5; k++){
			for (int j = 1; j < 6; j++){
				jTable5.setValueAt("", k, j);
			}
		}
	}
	
	public void setTable5(){
		float data1, data2;
		int station1, station2;
		for (int i=0; i<Global.RSNum; i++){
			if (t.rs.isBusy(i)){
				data1 = t.rs.getData1(i);
				data2 = t.rs.getData2(i);
				station1 = t.rs.getStation1(i);
				station2 = t.rs.getStation2(i);
				jTable5.setValueAt("yes", i, 1);
				jTable5.setValueAt(t.rs.getOp(i), i, 2);
				if (station1 == -1){
					jTable5.setValueAt(data1, i, 3);
				} else {
					jTable5.setValueAt(station1, i, 4);
				}
				if (station2 == -1){
					jTable5.setValueAt(data2, i, 5);
				} else {
					jTable5.setValueAt(station2, i, 6);
				}
			}
			else{
				for (int k = 2; k < 7; k++){
					jTable5.setValueAt("", i, k);
				}
				jTable5.setValueAt("no", i, 1);
			}
		}
	}

	private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO add your handling code here:
		String addrs = jTextField4.getText();
		int addr = Integer.parseInt(addrs);
		String values = jTextField6.getText();
		float value = Float.parseFloat(values);
		
		setTable3(addr, value);
		
		
		//.setValueAt(addr, arg1, arg2)
	}

	private void jTextField6ActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO add your handling code here:
	}

	private void jTextField4ActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO add your handling code here:
	}

	private void jTextField3ActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO add your handling code here:
	}

	private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO add your handling code here:
		
	}

	private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO add your handling code here:
		
		String ins = jTextField1.getText();
		t.instList.add(new InstructionItem(ins));
		jTextField1.setText("");
		/*refresh table show*/
		Object [][] content = new Object[t.instList.size()][4];
		for (int i = 0; i < t.instList.size(); i++){
			content[i][0] = t.instList.get(i).name;
			content[i][1] = (t.instList.get(i).issue == 0) ? "" : t.instList.get(i).issue;
			content[i][2] = (t.instList.get(i).execComp == 0) ? "" : t.instList.get(i).execComp;
			content[i][3] = (t.instList.get(i).writeback == 0) ? "" : t.instList.get(i).writeback;
		}
		jTable1.setModel(new javax.swing.table.DefaultTableModel(
				content , new String[] { "Inst Name", "Issue", "Exec Comp", "WB" }));
	}

	private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO add your handling code here:
		t.step();
//		Object [][] content = new Object[20][4];
//		for (int i = 0; i < t.instList.size(); i++){
//			content[i][0] = t.instList.get(i).name;
//			content[i][1] = (t.instList.get(i).issue == 0) ? "" : t.instList.get(i).issue;
//			content[i][2] = (t.instList.get(i).execComp == 0) ? "" : t.instList.get(i).execComp;
//			content[i][3] = (t.instList.get(i).writeback == 0) ? "" : t.instList.get(i).writeback;
//		}
//		jTable1.setModel(new javax.swing.table.DefaultTableModel(
//				content , new String[] { "Inst Name", "Issue", "Exec Comp", "WB" }));
		setTable2();
		setTable4();
		setTable5();
		int addr = t.mem.address;
		if (addr != -1){
			setTable3(addr, t.mem.mem[addr]);
			t.mem.address = -1;
		}
		jLabel9.setText(((Integer)t.clock).toString());
		jLabel11.setText(((Integer)t.pc).toString());
		setTable1();
		jLabel9.setText(((Integer)t.clock).toString());
		jLabel11.setText(((Integer)t.pc).toString());
	}

	private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO add your handling code here:
		t.runAll();
		setTable1();
		setTable2();
		setTable4();
		setTable5();
		jLabel9.setText(((Integer)t.clock).toString());
		jLabel11.setText(((Integer)t.pc).toString());
	}

	private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO add your handling code here:
		String regName = jTextField2.getText();
		String valueS = jTextField3.getText();
		int value = Integer.parseInt(valueS);
		int reg = -1;
		if (regName.length() == 1){
			reg = Integer.parseInt(regName);
		} else {
			reg = Integer.parseInt(regName.substring(1));
		}
		if ((reg>=0 && reg<Global.RegisterNum)){
			t.register.write(reg, value);
		}
		jTable2.setValueAt(value, reg, 1);
	}

	private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO add your handling code here:
	}

	private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO add your handling code here:
		try{
		javax.swing.JFileChooser jf = new javax.swing.JFileChooser();
		jf.setCurrentDirectory(new File("."));
		int val=jf.showOpenDialog(this);
	    if(val==JFileChooser.APPROVE_OPTION)
	    {
	    	File readin = jf.getSelectedFile();
	    	t = new Tomasulo();
	    	clearAllTable();
	    	jLabel9.setText("0");
	    	jLabel11.setText("0");
	    	BufferedReader bin = new BufferedReader(new FileReader(readin));
	    	String str = "";
	    	
	    	//int cnt = 0;
	    	while ( !(str = bin.readLine()).equals("END")){
	    		t.instList.add(new InstructionItem(str));
	    	}
	    	
	    	Object[][] content = new Object[t.instList.size()][4];
	    	
	    	for (int i = 0; i < t.instList.size(); i++){
	    		content[i][0] = t.instList.get(i).name;
	    		content[i][1] = "";
	    		content[i][2] = "";
	    		content[i][3] = "";
	    		
	    	}
    		jTable1.setModel(new javax.swing.table.DefaultTableModel(
    				content , new String[] { "Inst Name", "Issue", "Exec Comp", "WB" }));
	    }
	    else
	    {
//	      tf.setText("你取消了");
//	      tf2.setText("");
	    }
		}catch(Exception e){e.printStackTrace();}
	}

	/**
	 * @param args the command line arguments
	 */
	public static void main(String args[]) {
		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				new Gui().setVisible(true);
			}
		});
	}

	//GEN-BEGIN:vari

	// Variables declaration - do not m
	// End of variables declaration//GEN-END:variables

}