package ide.graphics;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Font;
import java.awt.Stroke;
import java.io.IOException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

import javax.swing.ImageIcon;
import javax.swing.JTextArea;

import language.type.Type;

/**
 * The Class GraphicsConstants. Holds the IDE default colors and fonts.
 */
public final class GraphicsConstants {
	// Constants class, can't be instantiated
	private GraphicsConstants() {
	}

	public static final String APP_NAME = "Flowchart IDE";

	public static final int TOOLBAR_HEIGHT = 60;
	public static final int TOOLBAR_PADDING = 5;

	public static final int TAB_PANEL_HEIGHT = 40;

	/** The Default APP_FONT. */
	public static final Font APP_FONT = new Font("Arial", Font.PLAIN, 12);

	public static final Color PIECE_TREE_BACKGROUND_COLOR = new Color(55, 85, 80);

	public static final Color PIECE_TREE_TEXT_COLOR = Color.WHITE;

	/** The Default MAIN_BACKROUND_COLOR. */
	public static final Color MAIN_BACKROUND_COLOR = new Color(100, 125, 120);

	/** The Default MENU_BACKROUND_COLOR. */
	public static final Color MENU_BACKROUND_COLOR = new Color(140, 165, 160);

	public static final Color SELECTED_TAB_BACKGROUND = new Color(150, 74, 89);

	public static final Color SELECTED_TAB_FOREGROUND = new Color(230, 230, 230);

	public static final Color DESELECTED_TAB_BACKGROUND = new Color(200, 220, 200);

	public static final Color DESELECTED_TAB_FOREGROUND = new Color(50, 50, 50);

	public static final Color TAB_PANEL_SCROLL_BAR_COLOR = new Color(150, 74, 89);
	public static final Color TAB_PANEL_SCROLL_BAR_HIGHLIGHT_COLOR = new Color(170, 90, 100);

	public static final Color TAB_PANEL_SCROLL_BAR_TRACK_COLOR = new Color(140, 165, 160);

	public static final Color TAB_PANEL_SCROLL_BAR_LIGHT_SHADOW = new Color(130, 30, 40);
	public static final Color TAB_PANEL_SCROLL_BAR_DARK_SHADOW = new Color(80, 20, 30);

	/** The Default PIECE_BACKGROUND. */
	public static final Color PIECE_BACKGROUND = new Color(190, 200, 200);

	/** The Default PIECE_TEXT. */
	public static final Color PIECE_TEXT = new Color(0, 10, 10);

	/** The Default MAIN_GRID_COLOR. */
	public static final Color MAIN_GRID_COLOR = new Color(180, 220, 220);

	/** The Default MAIN_GRID_ORIGIN_COLOR. */
	public static final Color MAIN_GRID_ORIGIN_COLOR = new Color(150, 74, 89);

	/** The Default LINE_DRAG_COLOR. */
	public static final Color LINE_DRAG_COLOR = Color.GREEN;

	@SuppressWarnings("serial")
	public static final Map<Type, Color> TYPE_COLORS = Collections.unmodifiableMap(new HashMap<Type, Color>() {
		{
			put(Type.NUMBER, new Color(50, 150, 200));
			put(Type.BOOLEAN, new Color(240, 100, 100));

			put(Type.ANY, Color.LIGHT_GRAY);
			put(Type.NONE, Color.BLACK);
		}
	});

	public static final Color SELECTION_COLOR = new Color(255, 200, 0, 100);
	public static final int SELECTION_WIDTH = 3;

	/** The Default PORT_COLOR. */
	public static final Color PORT_COLOR = Color.RED;
	/**
	 * The Default File Icon.
	 */
	public static final ImageIcon FILE_ICON = loadImageIcon("/icons/toolbar/file.png");

	public static final ImageIcon RUN_ICON = loadImageIcon("/icons/toolbar/run.png");

	public static final int TRASH_WIDTH = 50;
	public static final int TRASH_BORDER_SIZE = 15;
	public static final ImageIcon TRASH_ICON = resizeImage(loadImageIcon("/icons/trashcan.png"), TRASH_WIDTH);
	private static final int LEAF_WIDTH = 15;
	public static final ImageIcon PIECE_TREE_LEAF_ICON = resizeImage(loadImageIcon("/icons/piecetree/circleicon.png"), LEAF_WIDTH);
	private static final int OPEN_FOLDER_WIDTH = 15;
	public static final ImageIcon PIECE_TREE_OPEN_FOLDER_ICON = resizeImage(loadImageIcon("/icons/piecetree/circleicon.png"), OPEN_FOLDER_WIDTH);
	private static final int CLOSED_FOLDER_WIDTH = 15;
	public static final ImageIcon PIECE_TREE_CLOSED_FOLDER_ICON = resizeImage(loadImageIcon("/icons/piecetree/closedcircleicon.png"),
			CLOSED_FOLDER_WIDTH);
	public static final int PIECE_PICKER_WIDTH = 150;

	public static final Stroke DRAG_STROKE = new BasicStroke(2, BasicStroke.CAP_SQUARE, BasicStroke.JOIN_MITER, 10, new float[] { 5 }, 50);
	public static final float DASH_LENGTH = 20;
	public static final float DASH_SPEED = 0.05f;

	public static final Stroke getConnectionUpdateStroke(final int offset) {
		return new BasicStroke(2, BasicStroke.CAP_SQUARE, BasicStroke.JOIN_MITER, 10, new float[] { DASH_LENGTH / 2 }, offset);
	}

	public static final Stroke CONNECTION_NON_UPDATE_STROKE = new BasicStroke(2);

	public static final int CONSOLE_PANEL_DIVIDER_LOCATION = 450;

	public static final int CONSOLE_PANEL_DIVIER_SIZE = 5;

	private static ImageIcon loadImageIcon(final String filename) {
		ImageIcon icon;
		try {
			icon = new ImageIcon(GraphicsUtils.loadImage(filename));
		} catch (final IOException e) {
			icon = new ImageIcon("Could not find image");
			e.printStackTrace();
		}
		return icon;
	}

	private static ImageIcon resizeImage(final ImageIcon original, final int width) {
		return new ImageIcon(GraphicsUtils.resize(original.getImage(), width,
				(int) (original.getIconHeight() * ((double) width / original.getIconWidth()))));
	}

	public static JTextArea createConsole() {
		final JTextArea console = new JTextArea();
		return console;
	}
}
