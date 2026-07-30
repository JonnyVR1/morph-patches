package com.imomo.momo.mediaencoder;

/* JADX INFO: loaded from: classes7.dex */
public class EncodeParam {
    public static final int RC_METHOD_CRF = 1;
    public static final int RC_METHOD_DEFAULT = 0;
    public static final int RC_METHOD_VBR = 2;
    public int inputWidth = 0;
    public int inputHeight = 0;
    public int gopSize = 20;
    public int frameRate = 20;
    public int bFrameNum = 0;
    public int qPMin = 20;
    public int qPMax = 50;
    public int rcMethod = 1;
    public int bitsRate = 5242880;
    public int rfConstant = 23;
    public int slicedThreads = 1;
    public int multiSlice = 0;
    public int meRange = 2;
    public int genThreads = 1;
    public int subPelRefine = 0;
    public int meMethod = 0;
    public int enableCabac = 0;
    public int psnr = 0;
}
