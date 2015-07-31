/*
 * ATLauncher - https://github.com/ATLauncher/ATLauncher
 * Copyright (C) 2013 ATLauncher
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program. If not, see <http://www.gnu.org/licenses/>.
 */

package com.julauncher.gui.components;

import com.julauncher.App;
import com.julauncher.gui.CustomLineBorder;
import com.julauncher.utils.Utils;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JToolTip;
import javax.swing.border.Border;
import java.awt.Cursor;

public class SMButton extends JButton {
    private static final Cursor hand = new Cursor(Cursor.HAND_CURSOR);

    public SMButton(ImageIcon i, String tooltip) {
        super(i);
        this.setToolTipText(tooltip);
        this.setBorder(BorderFactory.createEmptyBorder());
        this.setContentAreaFilled(false);
        this.setCursor(hand);
    }

    public SMButton(String i, String t) {
        this(Utils.getIconImage(i), t);
    }

    public JToolTip createToolTip() {
        JToolTip tip = super.createToolTip();
        Border border = new CustomLineBorder(5, App.THEME.getHoverBorderColor(), 2);
        tip.setBorder(border);
        return tip;
    }
}