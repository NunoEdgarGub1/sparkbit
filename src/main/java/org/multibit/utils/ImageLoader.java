/* 
 * SparkBit
 *
 * Copyright 2011-2014 multibit.org
 * Copyright 2014 Coin Sciences Ltd
 *
 * Licensed under the MIT license (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://opensource.org/licenses/mit-license.php
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.multibit.utils;

import org.multibit.viewsystem.swing.MultiBitFrame;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.swing.*;

public final class ImageLoader {
    private static final Logger log = LoggerFactory.getLogger(ImageLoader.class);

    public static final String ACCEPT_ICON_FILE = "/images/accept.png";
    public static final String ADD_ICON_FILE = "/images/add.png";
    public static final String ADD_PASSWORD_ICON_FILE = "/images/lockAdd.png";
    public static final String CANCEL_ICON_FILE = "/images/cancel.png";
    public static final String CHANGE_PASSWORD_ICON_FILE = "/images/lockChange.png";
    public static final String CHART_LINE_ICON_FILE = "/images/chartLine.png";
    public static final String CHECK_PRIVATE_KEYS_ICON_FILE = "/images/checkKey.png";
    public static final String CLOSE_TAB_ICON_FILE = "/images/closeTab.png";
    public static final String CLOSE_WALLET_ICON_FILE = "/images/closeWallet.png";
    public static final String COPY_ICON_FILE = "/images/copy.png";
    public static final String CREATE_NEW_ICON_FILE = "/images/createNew.png";
    public static final String CROSS_ICON_FILE = "/images/cross.png";
    public static final String DELETE_ICON_FILE = "/images/delete.png";
    public static final String DELETE_ADDRESS_ICON_FILE = "/images/book_open_delete.png";
    public static final String EXCLAMATION_MARK_ICON_FILE = "/images/exclamationMark.png";
    public static final String EXPORT_PRIVATE_KEYS_ICON_FILE = "/images/exportKey.png";
    public static final String HELP_CONTENTS_BIG_ICON_FILE = "/images/helpContentsBig.png";
    public static final String HELP_CONTENTS_BIG_RTL_ICON_FILE = "/images/helpContentsBigRTL.png";
    public static final String HELP_CONTENTS_ICON_FILE = "/images/helpContents.png";
    public static final String HELP_CONTENTS_RTL_ICON_FILE = "/images/helpContentsRTL.png";
    public static final String HOURGLASS_ICON_FILE = "/images/hourglass.png";
    public static final String IMPORT_PRIVATE_KEYS_ICON_FILE = "/images/importKey.png";
    public static final String LOCK_ICON_FILE = "/images/lock.png";
    public static final String MESSAGES_ICON_FILE = "/images/comment.png";
    public static final String MESSAGE_SIGN_ICON_FILE = "/images/messageSign.png";
    public static final String MESSAGE_VERIFY_ICON_FILE = "/images/messageVerify.png";
    public static final String MONEY_ICON_FILE = "/images/money.png";
    
    public static final String MULTIBIT_128_ICON_FILE = "/images-coinspark/coinspark128.png";
    public static final String MULTIBIT_ICON_FILE = "/images-coinspark/coinspark32.png"; //48.png";
    public static final String MULTIBIT_SMALL_ICON_FILE = "/images-coinspark/coinspark16.png";
    
    public static final String OPEN_WALLET_ICON_FILE = "/images/openWallet.png";
    public static final String PASTE_ICON_FILE = "/images/paste.png";
    public static final String PREFERENCES_ICON_FILE = "/images/preferences.png";
    public static final String QUESTION_MARK_ICON_FILE = "/images/questionMark.png";
    public static final String RECEIVE_BITCOIN_ICON_FILE = "/images/receiveIn.png";
    public static final String REMOVE_PASSWORD_ICON_FILE = "/images/lockRemove.png";
    public static final String RESET_TRANSACTIONS_ICON_FILE = "/images/resetTransactions.png";
    public static final String SEND_BITCOIN_ICON_FILE = "/images/sendOut.png";
    public static final String SHAPE_TRIANGLE_ICON_FILE = "/images/shapeTriangle.png";
    public static final String SHAPE_SQUARE_ICON_FILE = "/images/shapeSquare.png";
    public static final String SHAPE_PENTAGON_ICON_FILE = "/images/shapePentagon.png";
    public static final String SHAPE_HEXAGON_ICON_FILE = "/images/shapeHexagon.png";
    public static final String SIDE_PANEL_SHOW_ICON_FILE = "/images/sidePanelShow.png";
    public static final String SIDE_PANEL_SHOW_RTL_ICON_FILE = "/images/sidePanelShowRTL.png";
    public static final String SIDE_PANEL_HIDE_ICON_FILE = "/images/sidePanelHide.png";
    public static final String SIDE_PANEL_HIDE_RTL_ICON_FILE = "/images/sidePanelHideRTL.png";
    public static final String SINGLE_WALLET_ICON_FILE = "/images/singleWallet.png";
    public static final String TICK_ICON_FILE = "/images/tick.png";
    public static final String TRANSACTIONS_ICON_FILE = "/images/transactions.png";
    public static final String TRANSACTIONS_EXPORT_ICON_FILE = "/images/transactionsExport.png";
    public static final String UNDO_ICON_FILE = "/images/undo.png";
    public static final String WELCOME_ICON_FILE = "/images/welcome.png";
    public static final String YOUR_WALLETS_ICON_FILE = "/images/yourWallets.png";
    public static final String ZOOM_ICON_FILE = "/images/zoom.png";

    /*CoinSpark START*/
    public static final String ASSETS_ICON_FILE = "/images/transactions.png";
    public static final String DEBUG_ICON_FILE = "/images/transactions.png";
    
    public static final String CS_WWW_ICON_FILE = "/images-coinspark/fatcow/www_page.png";
    //public static final String CS_CONTRACT_ICON_FILE = "/images-coinspark/fatcow/document_signature.png";
    
     public static final String CS_WARNING_ICON_FILE = "/images-coinspark/fatcow/16/warning.png";
     public static final String CS_FIRE_ICON_FILE = "/images-coinspark/fatcow/16/fire.png";
     public static final String CS_NEW_ICON_FILE = "/images-coinspark/fatcow/16/new.png";
     public static final String CS_WORLD_LINK_ICON_FILE = "/images-coinspark/fatcow/16/world_link.png";
     public static final String CS_CONTRACT_ICON_FILE = "/images-coinspark/fatcow/16/document_index.png";
     
    
    public static final String CS_FILE_EXTENSION_ICON_FILE_FORMAT_STRING = "/images-coinspark/fatcow/16/file_extension_%s.png";
    
    // Rename icon files, if they have a hypen - replace with underscore
    public enum FUGUE {
	balloon_ellipsis,
	balloon_white,
	clock__exclamation,
	download_cloud,
	tag_hash,
	traffic_cone__exclamation,
    }
    
    public enum FATCOW {
	add,
	arrow_refresh,
	arrow_refresh_small,
	attach,
	baggage_cart_box,
	ceo,
	clock,
	delete,
	document_index,
	document_signature,
	email,
	exclamation,
	eye,
	find,
	fire,
	help,
	hourglass,
	information,
	key,
	lock,
	new_new, // renamed file from new as the java keyword new caused problems
	note_pin,
	page_white,
	page_white_acrobat,
	page_white_database,
	page_white_find,
	page_white_error,
	page_white_text,
	picture,
//	question,
	server_connect,
	server_error,
	skull_old,
	support,
	thumb_down,
	thumb_up,
	tick,
	tick_shield,
	timeline,
	toolbox,
	user,
	warning,
	world,
	world_link
    }
    /*CoinSpark END*/
    
    /**
     * Utility class should not have a public constructor
     */
    private ImageLoader() {
    }

    /**
     * Returns an ImageIcon, or null if the path was invalid.
     */
    public static ImageIcon createImageIcon(String path) {
        if (path == null) {
            return null;
        }
        
        java.net.URL imgURL = MultiBitFrame.class.getResource(path);
        if (imgURL != null) {
            return new ImageIcon(imgURL);
        } else {
            log.error("org.multibit.MultiBitFrame#createImageIcon: Could not find file: " + path);
            return null;
        }
    }
    
    /*CoinSpark START*/
    
    public static ImageIcon fugue(FUGUE fc) {
	return createImageIcon("/images-coinspark/fugue/"+fc.toString()+".png");	
    }
    
    public static ImageIcon fugue(String name) {
	return createImageIcon("/images-coinspark/fugue/"+name+".png");		
    }
    
    public static ImageIcon fatCow16(FATCOW fc) {
	return createImageIcon("/images-coinspark/fatcow/16/"+fc.toString()+".png");
    }
    
    public static String fatCow16Path(FATCOW fc) {
	return "/images-coinspark/fatcow/16/"+fc.toString()+".png";
    }
    
    /**
     * Returns an ImageIcon, or null if the extension was invalid
     */
    public static ImageIcon createImageIconForFileExtension(String extension) {
        if (extension == null) {
            return null;
        }
	
	// Strip off . from extension as CSMimeType class returns with .
	if (extension.startsWith(".") && extension.length()>=2) {
	    extension = extension.substring(1);
	}
	extension = extension.toLowerCase();
        
	String path = String.format(CS_FILE_EXTENSION_ICON_FILE_FORMAT_STRING, extension);
	
        java.net.URL imgURL = MultiBitFrame.class.getResource(path);
        if (imgURL != null) {
            return new ImageIcon(imgURL);
        } else {
            log.error("org.multibit.MultiBitFrame#createImageIcon: Could not find file: " + path);
            return null;
        }
    }
    
    /*CoinSpark END*/
}
