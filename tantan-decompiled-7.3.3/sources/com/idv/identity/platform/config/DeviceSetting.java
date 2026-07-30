package com.idv.identity.platform.config;

/* JADX INFO: loaded from: classes7.dex */
public class DeviceSetting {
    boolean displayAuto = true;
    int displayAngle = 90;
    boolean cameraAuto = true;
    int cameraID = 1;
    boolean algorithmAuto = true;
    int algorithmAngle = 270;
    boolean widthAuto = true;
    int width = 640;
    int zoom = 0;
    int maxApiLevel = 100;
    int minApiLevel = 0;
    boolean isp = false;
    boolean slir = false;

    public int getAlgorithmAngle() {
        return this.algorithmAngle;
    }

    public int getCameraID() {
        return this.cameraID;
    }

    public int getDisplayAngle() {
        return this.displayAngle;
    }

    public int getMaxApiLevel() {
        return this.maxApiLevel;
    }

    public int getMinApiLevel() {
        return this.minApiLevel;
    }

    public int getWidth() {
        return this.width;
    }

    public int getZoom() {
        return this.zoom;
    }

    public boolean isAlgorithmAuto() {
        return this.algorithmAuto;
    }

    public boolean isCameraAuto() {
        return this.cameraAuto;
    }

    public boolean isDisplayAuto() {
        return this.displayAuto;
    }

    public boolean isIsp() {
        return this.isp;
    }

    public boolean isSlir() {
        return this.slir;
    }

    public boolean isWidthAuto() {
        return this.widthAuto;
    }

    public void setAlgorithmAngle(int i) {
        this.algorithmAngle = i;
    }

    public void setAlgorithmAuto(boolean z) {
        this.algorithmAuto = z;
    }

    public void setCameraAuto(boolean z) {
        this.cameraAuto = z;
    }

    public void setCameraID(int i) {
        this.cameraID = i;
    }

    public void setDisplayAngle(int i) {
        this.displayAngle = i;
    }

    public void setDisplayAuto(boolean z) {
        this.displayAuto = z;
    }

    public void setIsp(boolean z) {
        this.isp = z;
    }

    public void setMaxApiLevel(int i) {
        this.maxApiLevel = i;
    }

    public void setMinApiLevel(int i) {
        this.minApiLevel = i;
    }

    public void setSlir(boolean z) {
        this.slir = z;
    }

    public void setWidth(int i) {
        this.width = i;
    }

    public void setWidthAuto(boolean z) {
        this.widthAuto = z;
    }

    public void setZoom(int i) {
        this.zoom = i;
    }

    public String toString() {
        return "DeviceSetting{displayAuto=" + this.displayAuto + ", displayAngle=" + this.displayAngle + ", cameraAuto=" + this.cameraAuto + ", cameraID=" + this.cameraID + ", algorithmAuto=" + this.algorithmAuto + ", algorithmAngle=" + this.algorithmAngle + ", widthAuto=" + this.widthAuto + ", width=" + this.width + ", zoom=" + this.zoom + ", maxApiLevel=" + this.maxApiLevel + ", minApiLevel=" + this.minApiLevel + ", isp=" + this.isp + ", slir=" + this.slir + '}';
    }
}
