package com.p074ss.bytertc.engine.video;

import com.bytedance.realx.base.CalledByNative;
import java.util.HashMap;

/* JADX INFO: loaded from: classes11.dex */
public class FovVideoFrameInfo {
    private int destColumn;
    private int destRow;
    private int hdColumn;
    private int hdHeight;
    private int hdRow;
    private int hdWidth;
    private int ldColumn;
    private int ldHeight;
    private int ldRow;
    private int ldWidth;
    private int tileHeight;
    private HashMap<Short, Short> tileMap = new HashMap<>();
    private int tileWidth;

    @CalledByNative
    public static FovVideoFrameInfo genFovVideoFrameInfo() {
        return new FovVideoFrameInfo();
    }

    @CalledByNative
    private void putTileMapValue(short s, short s2) {
        this.tileMap.put(Short.valueOf(s), Short.valueOf(s2));
    }

    @CalledByNative
    private void setDestColumn(int i) {
        this.destColumn = i;
    }

    @CalledByNative
    private void setDestRow(int i) {
        this.destRow = i;
    }

    @CalledByNative
    private void setHdColumn(int i) {
        this.hdColumn = i;
    }

    @CalledByNative
    private void setHdHeight(int i) {
        this.hdHeight = i;
    }

    @CalledByNative
    private void setHdRow(int i) {
        this.hdRow = i;
    }

    @CalledByNative
    private void setHdWidth(int i) {
        this.hdWidth = i;
    }

    @CalledByNative
    private void setLdColumn(int i) {
        this.ldColumn = i;
    }

    @CalledByNative
    private void setLdHeight(int i) {
        this.ldHeight = i;
    }

    @CalledByNative
    private void setLdRow(int i) {
        this.ldRow = i;
    }

    @CalledByNative
    private void setLdWidth(int i) {
        this.ldWidth = i;
    }

    @CalledByNative
    private void setTileHeight(int i) {
        this.tileHeight = i;
    }

    @CalledByNative
    private void setTileWidth(int i) {
        this.tileWidth = i;
    }

    public int getDestColumn() {
        return this.destColumn;
    }

    public int getDestRow() {
        return this.destRow;
    }

    public int getHdColumn() {
        return this.hdColumn;
    }

    public int getHdHeight() {
        return this.hdHeight;
    }

    public int getHdRow() {
        return this.hdRow;
    }

    public int getHdWidth() {
        return this.hdWidth;
    }

    public int getLdColumn() {
        return this.ldColumn;
    }

    public int getLdHeight() {
        return this.ldHeight;
    }

    public int getLdRow() {
        return this.ldRow;
    }

    public int getLdWidth() {
        return this.ldWidth;
    }

    public int getTileHeight() {
        return this.tileHeight;
    }

    public HashMap<Short, Short> getTileMap() {
        return this.tileMap;
    }

    public int getTileWidth() {
        return this.tileWidth;
    }
}
