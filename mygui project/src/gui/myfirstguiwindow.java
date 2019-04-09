package gui;

import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.widgets.Text;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Spinner;
import org.eclipse.wb.swt.SWTResourceManager;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.events.MouseMoveListener;
import org.eclipse.swt.events.MouseEvent;

public class myfirstguiwindow {

	protected Shell shell;
	private Text VornameTF;
	private Label NachnameL;
	private Text PLZTF;
	private Text NachnameTF;
	private Text HausnummerTF;
	private Text StraﬂeTF;
	private Text OrtTF;
	private Label HausnummerL;
	private Label StraﬂeL;
	private Label PLZL;
	private Label OrtL;
	private Button btnAbbechen;

	/**
	 * Launch the application.
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			myfirstguiwindow window = new myfirstguiwindow();
			window.open();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Open the window.
	 */
	public void open() {
		Display display = Display.getDefault();
		createContents();
		shell.open();
		shell.layout();
		while (!shell.isDisposed()) {
			if (!display.readAndDispatch()) {
				display.sleep();
			}
		}
	}

	/**
	 * Create contents of the window.
	 */
	protected void createContents() {
		shell = new Shell();
		shell.setBackground(SWTResourceManager.getColor(SWT.COLOR_TITLE_BACKGROUND_GRADIENT));
		shell.setSize(450, 307);
		shell.setText("SWT Application");
		
		btnAbbechen = new Button(shell, SWT.NONE);
		btnAbbechen.setForeground(SWTResourceManager.getColor(255, 69, 0));
		btnAbbechen.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) { 
				System.exit(0);
			}
		});
		btnAbbechen.setBounds(308, 226, 75, 25);
		btnAbbechen.setText("ABBECHEN");
		
		VornameTF = new Text(shell, SWT.BORDER);
		VornameTF.setBounds(130, 101, 76, 21);
		
		
		Label VornameL = new Label(shell, SWT.NONE);
		VornameL.setBounds(66, 104, 55, 15);
		VornameL.setBackground(SWTResourceManager.getColor(SWT.COLOR_TITLE_INACTIVE_BACKGROUND_GRADIENT));
		VornameL.setText("Vorname");
		
		NachnameTF = new Text(shell, SWT.BORDER);
		NachnameTF.setBounds(130, 128, 76, 21);
		
		HausnummerTF = new Text(shell, SWT.BORDER);
		HausnummerTF.setBounds(130, 155, 76, 21);
		
		StraﬂeTF = new Text(shell, SWT.BORDER);
		StraﬂeTF.setBounds(130, 182, 76, 21);
		
		PLZTF = new Text(shell, SWT.BORDER);
		PLZTF.setBounds(130, 209, 76, 21);
		
		OrtTF = new Text(shell, SWT.BORDER);
		OrtTF.setBounds(130, 236, 76, 21);
		
		NachnameL = new Label(shell, SWT.NONE);
		NachnameL.setBounds(10, 131, 66, 15);
		NachnameL.setText("Nachname");
		
		HausnummerL = new Label(shell, SWT.NONE);
		HausnummerL.setBounds(10, 158, 81, 15);
		HausnummerL.setText("Hausnummer");
		
		StraﬂeL = new Label(shell, SWT.NONE);
		StraﬂeL.setText("Stra\u00DFe");
		StraﬂeL.setBounds(10, 185, 55, 15);
		
		PLZL = new Label(shell, SWT.NONE);
		PLZL.setBounds(10, 212, 55, 15);
		PLZL.setText("PLZ");
		
		OrtL = new Label(shell, SWT.NONE);
		OrtL.setBounds(10, 239, 55, 15);
		OrtL.setText("Ort");
		
		Button btnMyButton = new Button(shell, SWT.NONE);
		btnMyButton.setGrayed(true);
		btnMyButton.setForeground(SWTResourceManager.getColor(248, 248, 255));
		btnMyButton.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				System.out.println("Knopf gedr¸ckt");
				System.out.println(VornameTF.getText());
				System.out.println(NachnameTF.getText());
				System.out.println(HausnummerTF.getText());
				System.out.println(StraﬂeTF.getText());
				System.out.println(PLZTF.getText());
				System.out.println(OrtTF.getText());
			}
		});
		btnMyButton.setBounds(98, 32, 112, 51);
		btnMyButton.setText("MY BUTTON");
		
		Composite composite = new Composite(shell, SWT.NONE);
		composite.setBackground(SWTResourceManager.getColor(SWT.COLOR_YELLOW));
		composite.addMouseMoveListener(new MouseMoveListener() {
			public void mouseMove(MouseEvent arg0) {
				System.out.println(arg0.x + " / " + arg0.y);
				
			}
		});
		composite.setBounds(0, 10, 424, 247);

	}
}
