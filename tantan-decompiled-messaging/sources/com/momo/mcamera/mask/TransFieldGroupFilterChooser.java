package com.momo.mcamera.mask;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.text.TextUtils;
import com.core.glcore.util.FileUtil;
import com.core.glcore.util.JsonUtil;
import com.cosmos.mdlog.MDLog;
import com.momo.mcamera.util.MDLogTag;
import java.io.File;
import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.List;
import p149l.aif0;
import p149l.cn40;
import p149l.f7j0;
import p149l.fe3;
import p149l.h43;
import p149l.iqf0;
import p149l.j3w;
import p149l.k7j0;
import p149l.k9e;
import p149l.khq0;
import p149l.m3j;
import p149l.mh0;
import p149l.mhq0;
import p149l.mim;
import p149l.mpi0;
import p149l.npi0;
import p149l.opi0;
import p149l.p3j;
import p149l.pd5;
import p149l.qh0;
import p149l.sh0;
import p149l.ts2;
import p149l.ug50;
import p149l.uh0;
import p149l.uj0;
import p149l.uxi0;
import p149l.vaj;
import p149l.vd80;
import p149l.ygm;
import p149l.z4d0;

/* JADX INFO: loaded from: classes7.dex */
public class TransFieldGroupFilterChooser extends f7j0 {
    private j3w lookupFilter;
    private vd80 mBasicFilterPost;
    private ImageMoveStickerMaskFilter mBasicFilterPre;
    private Bitmap mBitmap;
    ug50 mFilterListener;
    private ygm mImageMovePreStickerBlendFilter;
    private Bitmap mLookup;
    private Sticker mStickerPre;
    aif0 processFilter;
    private int effectsCount = 5;
    private int effectIndex = 0;
    private int fixIndex = -1;
    private int softTransferIndex = 0;
    private boolean startPostWatermark = false;
    private boolean startPreWatermark = false;
    private boolean isFirstFrame = false;
    List<ts2> filterList = new ArrayList();
    mhq0 zoomFusionFilter = new mhq0();
    opi0 threeStateInFilter = new opi0();
    npi0 threeStateEnterFilter = new npi0();
    z4d0 rightToLeftGroupFilter = new z4d0();
    mpi0 threeGradualEffectFilter = new mpi0();
    m3j curImgFilter = new m3j();
    mim imageScaleWithColorChangingFilter = new mim();
    k9e downwardWithColorFilter = new k9e();
    fe3 bottomToTopGroupFilter = new fe3();
    sh0 albumTemplateOverlapGroupFilter = new sh0();
    qh0 albumTemplateGroupFilter = new qh0();
    mh0 albumGrayFilter = new mh0();
    uh0 albumTemplateVerticalGroupFilter = new uh0();
    uxi0 topShiftFilter = new uxi0();
    khq0 zoomEffectGroupFilter = new khq0();
    vaj fuzzyGradShiftFilter = new vaj();
    m3j frameAdpterBlurFilter = new m3j();

    public TransFieldGroupFilterChooser() {
        this.filterList.add(new cn40());
        aif0 aif0Var = new aif0(this.filterList);
        this.processFilter = aif0Var;
        aif0Var.m96812Q1(false);
    }

    private void analysisMaskMode(Context context, String str) {
        File file = new File(str);
        String str2 = file.getPath() + "/Pre/params.txt";
        if (!FileUtil.exist(str2)) {
            str2 = file.getPath() + "/Pre/params.json";
        }
        String str3 = file.getPath() + "/Pre/lookup.png";
        if (exist(str3) && this.mLookup != null) {
            this.mLookup = BitmapFactory.decodeFile(str3);
        }
        try {
            FileInputStream fileInputStream = new FileInputStream(file.getPath() + "/Post/overlayPost/overlayPost_000.png");
            this.mBitmap = BitmapFactory.decodeStream(fileInputStream);
            fileInputStream.close();
        } catch (Exception e) {
            MDLog.m7391e(MDLogTag.MOMENT_PICMOVIE_TAG, e.toString());
        }
        String strJsonStringFromFile = JsonUtil.getInstance().jsonStringFromFile(context, str2);
        if (TextUtils.isEmpty(strJsonStringFromFile)) {
            return;
        }
        MaskModel maskModel = (MaskModel) JsonUtil.getInstance().fromJson(strJsonStringFromFile, MaskModel.class);
        if (maskModel.getStickers() == null) {
            maskModel.setStickers(new ArrayList());
        }
        Sticker sticker = maskModel.getStickers().get(0);
        this.mStickerPre = sticker;
        sticker.setImageFolderPath(file.getPath() + "/Pre");
    }

    private boolean exist(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return new File(str).exists();
    }

    private boolean processFirstFrame(Bitmap bitmap, Bitmap bitmap2, List<ts2> list) {
        ygm ygmVar;
        ImageMoveStickerMaskFilter imageMoveStickerMaskFilter;
        if (this.startPreWatermark) {
            j3w j3wVar = new j3w();
            this.lookupFilter = j3wVar;
            Bitmap bitmap3 = this.mLookup;
            if (bitmap3 != null) {
                j3wVar.setLookupBitmap(bitmap3);
            }
            if (this.mImageMovePreStickerBlendFilter == null && (imageMoveStickerMaskFilter = this.mBasicFilterPre) != null && this.mStickerPre != null) {
                this.mImageMovePreStickerBlendFilter = new ygm(imageMoveStickerMaskFilter);
            }
            Sticker sticker = this.mStickerPre;
            if (sticker != null && (ygmVar = this.mImageMovePreStickerBlendFilter) != null) {
                sticker.curIndex = 0;
                ygmVar.m214729Q1(sticker.getBlendMode().name);
            }
            if ((bitmap == null && this.mImageMovePreStickerBlendFilter != null && this.startPreWatermark) || (this.isFirstFrame && this.startPreWatermark)) {
                int i = this.fixIndex;
                if (i == -3) {
                    this.fuzzyGradShiftFilter.m197641a2();
                    this.frameAdpterBlurFilter.mo148397R1(bitmap2);
                    this.fuzzyGradShiftFilter.m197633S1(0.8f);
                    this.fuzzyGradShiftFilter.m197635U1(0.0025f);
                    list.add(this.frameAdpterBlurFilter);
                    list.add(this.fuzzyGradShiftFilter);
                    if (this.mLookup != null) {
                        list.add(this.lookupFilter);
                    }
                    ygm ygmVar2 = this.mImageMovePreStickerBlendFilter;
                    if (ygmVar2 != null && this.mBasicFilterPre != null && this.mStickerPre != null) {
                        ygmVar2.m214730R1();
                        this.mImageMovePreStickerBlendFilter.m214731S1(0.0f);
                        list.add(this.mImageMovePreStickerBlendFilter);
                    }
                    this.processFilter.m96813R1(list);
                    this.isFirstFrame = false;
                    return true;
                }
                if (i == -4) {
                    this.fuzzyGradShiftFilter.m197641a2();
                    this.frameAdpterBlurFilter.mo148397R1(bitmap2);
                    this.fuzzyGradShiftFilter.m197632R1(0.8f);
                    this.fuzzyGradShiftFilter.m197635U1(-0.0025f);
                    list.add(this.frameAdpterBlurFilter);
                    list.add(this.fuzzyGradShiftFilter);
                    if (this.mLookup != null) {
                        list.add(this.lookupFilter);
                    }
                    ygm ygmVar3 = this.mImageMovePreStickerBlendFilter;
                    if (ygmVar3 != null && this.mBasicFilterPre != null && this.mStickerPre != null) {
                        ygmVar3.m214730R1();
                        this.mImageMovePreStickerBlendFilter.m214731S1(0.0f);
                        list.add(this.mImageMovePreStickerBlendFilter);
                    }
                    this.processFilter.m96813R1(list);
                    this.isFirstFrame = false;
                    return true;
                }
            }
        } else if (bitmap == null) {
            this.curImgFilter.mo148397R1(bitmap2);
            list.add(this.curImgFilter);
            this.processFilter.m96813R1(list);
            this.isFirstFrame = false;
            return true;
        }
        return false;
    }

    private void quickTransferTemplate(Bitmap bitmap, Bitmap bitmap2) {
        vd80 vd80Var;
        vd80 vd80Var2;
        vd80 vd80Var3;
        vd80 vd80Var4;
        vd80 vd80Var5;
        vd80 vd80Var6;
        vd80 vd80Var7;
        vd80 vd80Var8;
        vd80 vd80Var9;
        ArrayList arrayList = new ArrayList();
        int i = (this.softTransferIndex + 1) % 10;
        this.softTransferIndex = i;
        switch (i) {
            case 1:
                this.fuzzyGradShiftFilter.m197641a2();
                this.frameAdpterBlurFilter.mo148397R1(bitmap2);
                arrayList.add(this.frameAdpterBlurFilter);
                arrayList.add(this.fuzzyGradShiftFilter);
                if (!this.startPostWatermark || (vd80Var = this.mBasicFilterPost) == null) {
                    k7j0 k7j0Var = new k7j0();
                    k7j0Var.m144678Q1();
                    arrayList.add(k7j0Var);
                    k7j0Var.m144678Q1();
                } else {
                    vd80Var.m197978T1();
                    this.mBasicFilterPost.m197984Z1(3.0f);
                    this.mBasicFilterPost.setAlpha(0.4f);
                    this.mBasicFilterPost.m197979U1(0.08f);
                    this.mBasicFilterPost.m197982X1(0.05f, 0.5f);
                    arrayList.add(this.mBasicFilterPost);
                }
                this.processFilter.m96813R1(arrayList);
                this.fuzzyGradShiftFilter.m197633S1(0.7f);
                this.fuzzyGradShiftFilter.m197639Y1(true);
                break;
            case 2:
                uj0 uj0Var = new uj0();
                uj0Var.m193991W1();
                this.fuzzyGradShiftFilter.m197641a2();
                uj0Var.setBackgroundColour(1.0f, 1.0f, 1.0f, 1.0f);
                this.frameAdpterBlurFilter.mo148397R1(bitmap2);
                arrayList.add(this.frameAdpterBlurFilter);
                arrayList.add(this.fuzzyGradShiftFilter);
                if (this.startPostWatermark && (vd80Var2 = this.mBasicFilterPost) != null) {
                    vd80Var2.m197978T1();
                    this.mBasicFilterPost.m197984Z1(3.0f);
                    this.mBasicFilterPost.setAlpha(0.4f);
                    this.mBasicFilterPost.m197979U1(0.08f);
                    this.mBasicFilterPost.m197982X1(0.05f, 0.5f);
                    arrayList.add(this.mBasicFilterPost);
                }
                arrayList.add(uj0Var);
                this.processFilter.m96813R1(arrayList);
                uj0Var.m193985Q1(0.0f);
                uj0Var.m193986R1(0.016f);
                uj0Var.m193987S1(0.6f);
                this.fuzzyGradShiftFilter.m197640Z1(1.1f);
                this.fuzzyGradShiftFilter.m197637W1(0.0013f);
                this.fuzzyGradShiftFilter.m197636V1(0.0f);
                break;
            case 3:
                uj0 uj0Var2 = new uj0();
                uj0Var2.m193991W1();
                this.fuzzyGradShiftFilter.m197641a2();
                uj0Var2.setBackgroundColour(0.0f, 0.0f, 0.0f, 0.0f);
                this.frameAdpterBlurFilter.mo148397R1(bitmap2);
                arrayList.add(this.frameAdpterBlurFilter);
                arrayList.add(this.fuzzyGradShiftFilter);
                if (this.startPostWatermark && (vd80Var3 = this.mBasicFilterPost) != null) {
                    vd80Var3.m197978T1();
                    this.mBasicFilterPost.m197984Z1(3.0f);
                    this.mBasicFilterPost.setAlpha(0.4f);
                    this.mBasicFilterPost.m197979U1(0.08f);
                    this.mBasicFilterPost.m197982X1(0.05f, 0.5f);
                    arrayList.add(this.mBasicFilterPost);
                }
                arrayList.add(uj0Var2);
                this.processFilter.m96813R1(arrayList);
                uj0Var2.m193988T1(2.5f);
                uj0Var2.m193990V1(0.6f);
                uj0Var2.m193989U1(0.057f);
                this.fuzzyGradShiftFilter.m197633S1(1.0f);
                this.fuzzyGradShiftFilter.m197632R1(0.7f);
                this.fuzzyGradShiftFilter.m197635U1(-0.004f);
                break;
            case 4:
                h43 h43Var = new h43();
                h43Var.m129219R1();
                this.fuzzyGradShiftFilter.m197641a2();
                this.frameAdpterBlurFilter.mo148397R1(bitmap2);
                arrayList.add(this.frameAdpterBlurFilter);
                arrayList.add(this.fuzzyGradShiftFilter);
                arrayList.add(h43Var);
                if (this.startPostWatermark && (vd80Var4 = this.mBasicFilterPost) != null) {
                    vd80Var4.m197978T1();
                    this.mBasicFilterPost.m197984Z1(3.0f);
                    this.mBasicFilterPost.setAlpha(0.4f);
                    this.mBasicFilterPost.m197979U1(0.08f);
                    this.mBasicFilterPost.m197982X1(0.05f, 0.5f);
                    arrayList.add(this.mBasicFilterPost);
                }
                this.processFilter.m96813R1(arrayList);
                h43Var.m129218Q1(0.0f);
                this.fuzzyGradShiftFilter.m197633S1(0.88f);
                this.fuzzyGradShiftFilter.m197635U1(0.0016f);
                break;
            case 5:
                uj0 uj0Var3 = new uj0();
                uj0Var3.m193991W1();
                this.fuzzyGradShiftFilter.m197641a2();
                uj0Var3.setBackgroundColour(0.0f, 0.0f, 0.0f, 0.0f);
                this.frameAdpterBlurFilter.mo148397R1(bitmap2);
                arrayList.add(this.frameAdpterBlurFilter);
                arrayList.add(this.fuzzyGradShiftFilter);
                if (this.startPostWatermark && (vd80Var5 = this.mBasicFilterPost) != null) {
                    vd80Var5.m197978T1();
                    this.mBasicFilterPost.m197984Z1(3.0f);
                    this.mBasicFilterPost.setAlpha(0.4f);
                    this.mBasicFilterPost.m197979U1(0.08f);
                    this.mBasicFilterPost.m197982X1(0.05f, 0.5f);
                    arrayList.add(this.mBasicFilterPost);
                }
                arrayList.add(uj0Var3);
                this.processFilter.m96813R1(arrayList);
                uj0Var3.m193988T1(2.0f);
                uj0Var3.m193990V1(0.6f);
                uj0Var3.m193989U1(0.016f);
                this.fuzzyGradShiftFilter.m197633S1(1.0f);
                this.fuzzyGradShiftFilter.m197632R1(0.5f);
                this.fuzzyGradShiftFilter.m197635U1(-0.0067f);
                break;
            case 6:
                this.fuzzyGradShiftFilter.m197641a2();
                this.frameAdpterBlurFilter.mo148397R1(bitmap2);
                arrayList.add(this.frameAdpterBlurFilter);
                arrayList.add(this.fuzzyGradShiftFilter);
                if (this.startPostWatermark && (vd80Var6 = this.mBasicFilterPost) != null) {
                    vd80Var6.m197978T1();
                    this.mBasicFilterPost.m197984Z1(3.0f);
                    this.mBasicFilterPost.setAlpha(0.4f);
                    this.mBasicFilterPost.m197979U1(0.08f);
                    this.mBasicFilterPost.m197982X1(0.05f, 0.5f);
                    arrayList.add(this.mBasicFilterPost);
                }
                this.processFilter.m96813R1(arrayList);
                this.fuzzyGradShiftFilter.m197633S1(1.0f);
                this.fuzzyGradShiftFilter.m197632R1(0.8f);
                this.fuzzyGradShiftFilter.m197635U1(-0.0027f);
                break;
            case 7:
                uj0 uj0Var4 = new uj0();
                uj0 uj0Var5 = new uj0();
                uj0Var4.m193991W1();
                uj0Var5.m193991W1();
                this.zoomEffectGroupFilter.m145990Z1(bitmap, bitmap2);
                arrayList.add(this.zoomEffectGroupFilter);
                if (this.startPostWatermark && (vd80Var7 = this.mBasicFilterPost) != null) {
                    vd80Var7.m197978T1();
                    this.mBasicFilterPost.m197984Z1(3.0f);
                    this.mBasicFilterPost.setAlpha(0.4f);
                    this.mBasicFilterPost.m197979U1(0.08f);
                    this.mBasicFilterPost.m197982X1(0.05f, 0.5f);
                    arrayList.add(this.mBasicFilterPost);
                }
                arrayList.add(uj0Var4);
                arrayList.add(uj0Var5);
                this.processFilter.m96813R1(arrayList);
                uj0Var4.m193988T1(0.0f);
                uj0Var4.m193990V1(0.6f);
                uj0Var4.m193989U1(-0.04f);
                this.zoomEffectGroupFilter.m145981Q1(1.2f);
                this.zoomEffectGroupFilter.m145982R1(0.8f);
                this.zoomEffectGroupFilter.m145983S1(0.02f);
                this.zoomEffectGroupFilter.m145984T1(1.2f);
                this.zoomEffectGroupFilter.m145985U1(0.003f);
                uj0Var5.m193988T1(2.4f);
                uj0Var5.m193990V1(0.0f);
                uj0Var5.m193989U1(0.067f);
                break;
            case 8:
                iqf0 iqf0Var = new iqf0();
                iqf0Var.m137759S1();
                this.fuzzyGradShiftFilter.m197641a2();
                this.frameAdpterBlurFilter.mo148397R1(bitmap2);
                arrayList.add(this.frameAdpterBlurFilter);
                arrayList.add(this.fuzzyGradShiftFilter);
                arrayList.add(iqf0Var);
                if (this.startPostWatermark && (vd80Var8 = this.mBasicFilterPost) != null) {
                    vd80Var8.m197978T1();
                    this.mBasicFilterPost.m197984Z1(3.0f);
                    this.mBasicFilterPost.setAlpha(0.4f);
                    this.mBasicFilterPost.m197979U1(0.08f);
                    this.mBasicFilterPost.m197982X1(0.05f, 0.5f);
                    arrayList.add(this.mBasicFilterPost);
                }
                this.processFilter.m96813R1(arrayList);
                iqf0Var.m137758R1(0.0f);
                iqf0Var.m137757Q1(0.083f);
                this.fuzzyGradShiftFilter.m197633S1(1.0f);
                this.fuzzyGradShiftFilter.m197632R1(0.7f);
                this.fuzzyGradShiftFilter.m197635U1(-0.005f);
                this.fuzzyGradShiftFilter.m197638X1(0.6f);
                break;
            case 9:
                pd5 pd5Var = new pd5();
                pd5Var.m168384U1();
                pd5Var.m168383T1(3.0f);
                this.zoomEffectGroupFilter.m145990Z1(bitmap, bitmap2);
                arrayList.add(this.zoomEffectGroupFilter);
                this.zoomEffectGroupFilter.m145982R1(0.8f);
                this.zoomEffectGroupFilter.m145983S1(0.02f);
                this.zoomEffectGroupFilter.m145984T1(1.0f);
                this.zoomEffectGroupFilter.m145985U1(0.0f);
                this.zoomEffectGroupFilter.m145986V1(0.5f);
                this.zoomEffectGroupFilter.m145987W1(0.0f);
                this.zoomEffectGroupFilter.m145981Q1(1.3f);
                this.zoomEffectGroupFilter.m145992b2(1.1f);
                this.zoomEffectGroupFilter.m145988X1(0.5f);
                this.zoomEffectGroupFilter.m145989Y1(0.0014f);
                arrayList.add(pd5Var);
                if (this.startPostWatermark && (vd80Var9 = this.mBasicFilterPost) != null) {
                    vd80Var9.m197978T1();
                    this.mBasicFilterPost.m197984Z1(3.8f);
                    this.mBasicFilterPost.setAlpha(0.4f);
                    this.mBasicFilterPost.m197979U1(0.08f);
                    this.mBasicFilterPost.m197982X1(0.05f, 0.5f);
                    arrayList.add(this.mBasicFilterPost);
                }
                this.processFilter.m96813R1(arrayList);
                break;
        }
    }

    private synchronized void setEffectIndex(int i) {
        this.fixIndex = i;
        this.isFirstFrame = true;
        this.effectIndex = 0;
        this.softTransferIndex = 0;
    }

    private void softTransferTemplate(Bitmap bitmap, Bitmap bitmap2) {
        vd80 vd80Var;
        vd80 vd80Var2;
        vd80 vd80Var3;
        vd80 vd80Var4;
        vd80 vd80Var5;
        vd80 vd80Var6;
        vd80 vd80Var7;
        vd80 vd80Var8;
        vd80 vd80Var9;
        ArrayList arrayList = new ArrayList();
        uj0 uj0Var = new uj0();
        uj0Var.setBackgroundColour(1.0f, 1.0f, 1.0f, 1.0f);
        int i = (this.softTransferIndex + 1) % 10;
        this.softTransferIndex = i;
        switch (i) {
            case 1:
                this.zoomEffectGroupFilter.m145990Z1(bitmap, bitmap2);
                arrayList.add(this.zoomEffectGroupFilter);
                if (this.startPostWatermark && (vd80Var = this.mBasicFilterPost) != null) {
                    vd80Var.m197978T1();
                    this.mBasicFilterPost.m197984Z1(3.0f);
                    this.mBasicFilterPost.setAlpha(0.5f);
                    this.mBasicFilterPost.m197979U1(0.02f);
                    this.mBasicFilterPost.m197980V1(0.95f, 0.95f);
                    this.mBasicFilterPost.m197982X1(0.98f, 0.95f);
                    this.mBasicFilterPost.m197981W1(-0.008f);
                    arrayList.add(this.mBasicFilterPost);
                }
                this.processFilter.m96813R1(arrayList);
                this.zoomEffectGroupFilter.m145982R1(0.8f);
                this.zoomEffectGroupFilter.m145983S1(0.016f);
                this.zoomEffectGroupFilter.m145984T1(1.3f);
                this.zoomEffectGroupFilter.m145985U1(0.004f);
                this.zoomEffectGroupFilter.m145986V1(0.5f);
                this.zoomEffectGroupFilter.m145987W1(0.0f);
                this.zoomEffectGroupFilter.m145981Q1(1.0f);
                this.zoomEffectGroupFilter.m145992b2(1.0f);
                break;
            case 2:
                uj0Var.m193991W1();
                uj0Var.m193985Q1(0.0f);
                this.zoomEffectGroupFilter.m145990Z1(bitmap, bitmap2);
                arrayList.add(this.zoomEffectGroupFilter);
                if (!this.startPostWatermark || (vd80Var2 = this.mBasicFilterPost) == null) {
                    this.zoomEffectGroupFilter.m145991a2(true, 0);
                } else {
                    vd80Var2.m197978T1();
                    this.mBasicFilterPost.m197984Z1(3.0f);
                    this.mBasicFilterPost.setAlpha(0.5f);
                    this.mBasicFilterPost.m197979U1(0.02f);
                    this.mBasicFilterPost.m197980V1(0.95f, 0.95f);
                    this.mBasicFilterPost.m197982X1(0.98f, 0.95f);
                    this.mBasicFilterPost.m197981W1(-0.008f);
                    arrayList.add(this.mBasicFilterPost);
                    this.zoomEffectGroupFilter.m145991a2(false, 0);
                }
                arrayList.add(uj0Var);
                this.processFilter.m96813R1(arrayList);
                this.zoomEffectGroupFilter.m145982R1(0.8f);
                this.zoomEffectGroupFilter.m145983S1(0.016f);
                this.zoomEffectGroupFilter.m145984T1(1.2f);
                this.zoomEffectGroupFilter.m145985U1(-0.003f);
                this.zoomEffectGroupFilter.m145986V1(0.5f);
                this.zoomEffectGroupFilter.m145987W1(0.0f);
                this.zoomEffectGroupFilter.m145981Q1(1.0f);
                this.zoomEffectGroupFilter.m145992b2(1.0f);
                uj0Var.m193987S1(0.8f);
                uj0Var.m193986R1(0.006f);
                break;
            case 3:
                uj0Var.m193991W1();
                uj0Var.m193985Q1(0.0f);
                this.zoomEffectGroupFilter.m145990Z1(bitmap, bitmap2);
                arrayList.add(this.zoomEffectGroupFilter);
                if (this.startPostWatermark && (vd80Var3 = this.mBasicFilterPost) != null) {
                    vd80Var3.m197978T1();
                    this.mBasicFilterPost.m197984Z1(3.0f);
                    this.mBasicFilterPost.setAlpha(0.5f);
                    this.mBasicFilterPost.m197979U1(0.02f);
                    this.mBasicFilterPost.m197980V1(0.95f, 0.95f);
                    this.mBasicFilterPost.m197982X1(0.98f, 0.95f);
                    this.mBasicFilterPost.m197981W1(-0.008f);
                    arrayList.add(this.mBasicFilterPost);
                }
                arrayList.add(uj0Var);
                this.processFilter.m96813R1(arrayList);
                this.zoomEffectGroupFilter.m145982R1(0.9f);
                this.zoomEffectGroupFilter.m145983S1(0.01f);
                this.zoomEffectGroupFilter.m145984T1(1.0f);
                this.zoomEffectGroupFilter.m145985U1(0.0f);
                this.zoomEffectGroupFilter.m145986V1(0.5f);
                this.zoomEffectGroupFilter.m145987W1(0.0025f);
                this.zoomEffectGroupFilter.m145981Q1(1.2f);
                this.zoomEffectGroupFilter.m145992b2(1.2f);
                uj0Var.m193987S1(0.7f);
                uj0Var.m193986R1(0.03f);
                this.zoomEffectGroupFilter.m145991a2(true, 1);
                break;
            case 4:
                this.zoomEffectGroupFilter.m145990Z1(bitmap, bitmap2);
                arrayList.add(this.zoomEffectGroupFilter);
                if (this.startPostWatermark && (vd80Var4 = this.mBasicFilterPost) != null) {
                    vd80Var4.m197978T1();
                    this.mBasicFilterPost.m197984Z1(3.0f);
                    this.mBasicFilterPost.setAlpha(0.5f);
                    this.mBasicFilterPost.m197979U1(0.02f);
                    this.mBasicFilterPost.m197980V1(0.95f, 0.95f);
                    this.mBasicFilterPost.m197982X1(0.98f, 0.95f);
                    this.mBasicFilterPost.m197981W1(-0.008f);
                    arrayList.add(this.mBasicFilterPost);
                }
                this.processFilter.m96813R1(arrayList);
                this.zoomEffectGroupFilter.m145982R1(0.95f);
                this.zoomEffectGroupFilter.m145983S1(0.01f);
                this.zoomEffectGroupFilter.m145984T1(1.2f);
                this.zoomEffectGroupFilter.m145985U1(-0.0026f);
                this.zoomEffectGroupFilter.m145986V1(0.5f);
                this.zoomEffectGroupFilter.m145987W1(0.0f);
                this.zoomEffectGroupFilter.m145981Q1(1.0f);
                this.zoomEffectGroupFilter.m145992b2(1.0f);
                break;
            case 5:
                uj0Var.m193991W1();
                uj0Var.m193985Q1(0.0f);
                this.zoomEffectGroupFilter.m145990Z1(bitmap, bitmap2);
                arrayList.add(this.zoomEffectGroupFilter);
                if (this.startPostWatermark && (vd80Var5 = this.mBasicFilterPost) != null) {
                    vd80Var5.m197978T1();
                    this.mBasicFilterPost.m197984Z1(3.0f);
                    this.mBasicFilterPost.setAlpha(0.5f);
                    this.mBasicFilterPost.m197979U1(0.02f);
                    this.mBasicFilterPost.m197980V1(0.95f, 0.95f);
                    this.mBasicFilterPost.m197982X1(0.98f, 0.95f);
                    this.mBasicFilterPost.m197981W1(-0.008f);
                    arrayList.add(this.mBasicFilterPost);
                }
                arrayList.add(uj0Var);
                this.processFilter.m96813R1(arrayList);
                this.zoomEffectGroupFilter.m145982R1(0.8f);
                this.zoomEffectGroupFilter.m145983S1(0.016f);
                this.zoomEffectGroupFilter.m145984T1(1.2f);
                this.zoomEffectGroupFilter.m145985U1(0.0026f);
                this.zoomEffectGroupFilter.m145986V1(0.5f);
                this.zoomEffectGroupFilter.m145987W1(0.0f);
                this.zoomEffectGroupFilter.m145981Q1(1.0f);
                this.zoomEffectGroupFilter.m145992b2(1.0f);
                uj0Var.m193987S1(0.8f);
                uj0Var.m193986R1(0.04f);
                break;
            case 6:
                this.zoomEffectGroupFilter.m145990Z1(bitmap, bitmap2);
                arrayList.add(this.zoomEffectGroupFilter);
                if (this.startPostWatermark && (vd80Var6 = this.mBasicFilterPost) != null) {
                    vd80Var6.m197978T1();
                    this.mBasicFilterPost.m197978T1();
                    this.mBasicFilterPost.m197984Z1(3.0f);
                    this.mBasicFilterPost.setAlpha(0.5f);
                    this.mBasicFilterPost.m197979U1(0.02f);
                    this.mBasicFilterPost.m197980V1(0.95f, 0.95f);
                    this.mBasicFilterPost.m197982X1(0.98f, 0.95f);
                    this.mBasicFilterPost.m197981W1(-0.008f);
                    arrayList.add(this.mBasicFilterPost);
                }
                this.processFilter.m96813R1(arrayList);
                this.zoomEffectGroupFilter.m145982R1(0.9f);
                this.zoomEffectGroupFilter.m145983S1(0.008f);
                this.zoomEffectGroupFilter.m145984T1(1.0f);
                this.zoomEffectGroupFilter.m145985U1(0.0f);
                this.zoomEffectGroupFilter.m145986V1(0.5f);
                this.zoomEffectGroupFilter.m145987W1(0.0026f);
                this.zoomEffectGroupFilter.m145981Q1(1.0f);
                this.zoomEffectGroupFilter.m145992b2(1.2f);
                break;
            case 7:
                this.zoomEffectGroupFilter.m145990Z1(bitmap, bitmap2);
                arrayList.add(this.zoomEffectGroupFilter);
                if (this.startPostWatermark && (vd80Var7 = this.mBasicFilterPost) != null) {
                    vd80Var7.m197978T1();
                    this.mBasicFilterPost.m197984Z1(3.0f);
                    this.mBasicFilterPost.setAlpha(0.5f);
                    this.mBasicFilterPost.m197979U1(0.02f);
                    this.mBasicFilterPost.m197980V1(0.95f, 0.95f);
                    this.mBasicFilterPost.m197982X1(0.98f, 0.95f);
                    this.mBasicFilterPost.m197981W1(-0.008f);
                    arrayList.add(this.mBasicFilterPost);
                }
                this.processFilter.m96813R1(arrayList);
                this.zoomEffectGroupFilter.m145982R1(0.85f);
                this.zoomEffectGroupFilter.m145983S1(0.012f);
                this.zoomEffectGroupFilter.m145984T1(1.2f);
                this.zoomEffectGroupFilter.m145985U1(-0.0026f);
                this.zoomEffectGroupFilter.m145986V1(0.5f);
                this.zoomEffectGroupFilter.m145987W1(0.0f);
                this.zoomEffectGroupFilter.m145981Q1(1.0f);
                this.zoomEffectGroupFilter.m145992b2(1.0f);
                break;
            case 8:
                this.zoomEffectGroupFilter.m145990Z1(bitmap, bitmap2);
                arrayList.add(this.zoomEffectGroupFilter);
                if (this.startPostWatermark && (vd80Var8 = this.mBasicFilterPost) != null) {
                    vd80Var8.m197978T1();
                    this.mBasicFilterPost.m197984Z1(3.0f);
                    this.mBasicFilterPost.setAlpha(0.5f);
                    this.mBasicFilterPost.m197979U1(0.02f);
                    this.mBasicFilterPost.m197980V1(0.95f, 0.95f);
                    this.mBasicFilterPost.m197982X1(0.98f, 0.95f);
                    this.mBasicFilterPost.m197981W1(-0.008f);
                    arrayList.add(this.mBasicFilterPost);
                }
                this.processFilter.m96813R1(arrayList);
                this.zoomEffectGroupFilter.m145982R1(0.95f);
                this.zoomEffectGroupFilter.m145983S1(0.001f);
                this.zoomEffectGroupFilter.m145984T1(1.0f);
                this.zoomEffectGroupFilter.m145985U1(0.0f);
                this.zoomEffectGroupFilter.m145986V1(0.5f);
                this.zoomEffectGroupFilter.m145987W1(0.0026f);
                this.zoomEffectGroupFilter.m145981Q1(1.0f);
                this.zoomEffectGroupFilter.m145992b2(1.2f);
                break;
            case 9:
                this.zoomEffectGroupFilter.m145990Z1(bitmap, bitmap2);
                arrayList.add(this.zoomEffectGroupFilter);
                if (this.startPostWatermark && (vd80Var9 = this.mBasicFilterPost) != null) {
                    vd80Var9.m197978T1();
                    this.mBasicFilterPost.m197984Z1(3.0f);
                    this.mBasicFilterPost.setAlpha(0.5f);
                    this.mBasicFilterPost.m197979U1(0.02f);
                    this.mBasicFilterPost.m197980V1(0.95f, 0.95f);
                    this.mBasicFilterPost.m197982X1(0.98f, 0.95f);
                    this.mBasicFilterPost.m197981W1(-0.008f);
                    arrayList.add(this.mBasicFilterPost);
                }
                this.processFilter.m96813R1(arrayList);
                this.zoomEffectGroupFilter.m145982R1(0.95f);
                this.zoomEffectGroupFilter.m145983S1(0.001f);
                this.zoomEffectGroupFilter.m145984T1(1.2f);
                this.zoomEffectGroupFilter.m145985U1(-0.0026f);
                this.zoomEffectGroupFilter.m145986V1(0.5f);
                this.zoomEffectGroupFilter.m145987W1(0.0f);
                this.zoomEffectGroupFilter.m145981Q1(1.0f);
                this.zoomEffectGroupFilter.m145992b2(1.2f);
                break;
        }
    }

    @Override // p149l.f7j0
    public ts2 getVideoProcessFilter() {
        return this.processFilter;
    }

    @Override // p149l.f7j0
    public void lockCoverFrame(Bitmap bitmap, p3j.InterfaceC19124a interfaceC19124a) {
        if (bitmap == null) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        m3j m3jVar = this.curImgFilter;
        if (m3jVar == null || this.processFilter == null) {
            return;
        }
        m3jVar.mo148397R1(bitmap);
        arrayList.add(this.curImgFilter);
        p3j p3jVar = new p3j();
        p3jVar.m167249Q1(interfaceC19124a);
        arrayList.add(p3jVar);
        this.processFilter.m96813R1(arrayList);
    }

    @Override // p149l.f7j0
    public synchronized void lockFrame(Bitmap bitmap) {
        if (bitmap == null) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        m3j m3jVar = this.curImgFilter;
        if (m3jVar != null && this.processFilter != null) {
            m3jVar.mo148397R1(bitmap);
            arrayList.add(this.curImgFilter);
            this.processFilter.m96813R1(arrayList);
        }
    }

    @Override // p149l.f7j0
    public void reset() {
        setEffectIndex(this.fixIndex);
    }

    public void setEffectBottomToTop() {
        setEffectIndex(f7j0.FILTER_BOTTOM_TO_TOP_INDEX);
    }

    public void setEffectDiffusion() {
        setEffectIndex(f7j0.FILTER_DIFFUSION_INDEX);
    }

    public void setEffectRightToLeft() {
        setEffectIndex(f7j0.FILTER_RIGHT_TO_LEFT_INDEX);
    }

    public void setEffectSeries() {
        setEffectIndex(-1);
    }

    public void setEffectTemplateQuick(Context context, String str, Bitmap bitmap) {
        Sticker sticker;
        Sticker sticker2;
        setEffectIndex(-4);
        analysisMaskMode(context, str);
        ImageMoveStickerMaskFilter imageMoveStickerMaskFilter = this.mBasicFilterPre;
        if (imageMoveStickerMaskFilter == null && (sticker2 = this.mStickerPre) != null) {
            this.mBasicFilterPre = new ImageMoveStickerMaskFilter(context, sticker2);
        } else if (imageMoveStickerMaskFilter != null && (sticker = this.mStickerPre) != null) {
            imageMoveStickerMaskFilter.updateSticker(sticker);
        }
        this.mBitmap = bitmap;
        vd80 vd80Var = new vd80();
        this.mBasicFilterPost = vd80Var;
        vd80Var.m197983Y1(this.mBitmap);
        this.startPostWatermark = true;
        this.startPreWatermark = true;
    }

    public void setEffectTemplateSeries() {
        setEffectIndex(-2);
    }

    public void setEffectTemplateSoft(Context context, String str) {
        Sticker sticker;
        Sticker sticker2;
        setEffectIndex(-3);
        analysisMaskMode(context, str);
        ImageMoveStickerMaskFilter imageMoveStickerMaskFilter = this.mBasicFilterPre;
        if (imageMoveStickerMaskFilter == null && (sticker2 = this.mStickerPre) != null) {
            this.mBasicFilterPre = new ImageMoveStickerMaskFilter(context, sticker2);
        } else if (imageMoveStickerMaskFilter != null && (sticker = this.mStickerPre) != null) {
            imageMoveStickerMaskFilter.updateSticker(sticker);
        }
        vd80 vd80Var = new vd80();
        this.mBasicFilterPost = vd80Var;
        vd80Var.m197983Y1(this.mBitmap);
        this.startPostWatermark = true;
        this.startPreWatermark = true;
    }

    @Override // p149l.f7j0
    public void setFrameRate(int i) {
        this.zoomFusionFilter.setFrameRate(25);
        this.rightToLeftGroupFilter.setFrameRate(25);
        this.bottomToTopGroupFilter.setFrameRate(25);
    }

    public void setLookupPath(String str) {
        k9e k9eVar = this.downwardWithColorFilter;
        if (k9eVar != null) {
            k9eVar.setLookupPath(str);
        }
        mim mimVar = this.imageScaleWithColorChangingFilter;
        if (mimVar != null) {
            mimVar.setLookupPath(str);
        }
        mpi0 mpi0Var = this.threeGradualEffectFilter;
        if (mpi0Var != null) {
            mpi0Var.setLookupPath(str);
        }
    }

    public synchronized void setTransferFieldImage(Bitmap bitmap, Bitmap bitmap2) {
        if (bitmap2 == null) {
            return;
        }
        try {
            ArrayList arrayList = new ArrayList();
            if (processFirstFrame(bitmap, bitmap2, arrayList)) {
                return;
            }
            int i = this.fixIndex;
            if (i == -1) {
                int i2 = this.effectIndex + 1;
                this.effectIndex = i2;
                this.effectIndex = i2 % this.effectsCount;
            } else if (i == -2) {
                this.effectIndex = ((this.effectIndex + 1) % 4) + 8;
            } else if (i == -3) {
                softTransferTemplate(bitmap, bitmap2);
                return;
            } else {
                if (i == -4) {
                    quickTransferTemplate(bitmap, bitmap2);
                    return;
                }
                this.effectIndex = i;
            }
            int i3 = this.effectIndex;
            if (i3 == 0) {
                this.threeGradualEffectFilter.m155810R1(bitmap, bitmap2);
                arrayList.add(this.threeGradualEffectFilter);
                this.processFilter.m96813R1(arrayList);
            } else if (i3 == 1) {
                this.curImgFilter.mo148397R1(bitmap2);
                arrayList.add(this.curImgFilter);
                arrayList.add(this.threeStateInFilter);
                this.processFilter.m96813R1(arrayList);
                this.threeStateInFilter.m165360Q1();
            } else if (i3 == 2) {
                this.downwardWithColorFilter.m145043R1(bitmap, bitmap2);
                arrayList.add(this.downwardWithColorFilter);
                this.processFilter.m96813R1(arrayList);
            } else if (i3 == 3) {
                this.curImgFilter.mo148397R1(bitmap2);
                arrayList.add(this.curImgFilter);
                arrayList.add(this.threeStateEnterFilter);
                this.processFilter.m96813R1(arrayList);
                this.threeStateEnterFilter.m160507Q1();
            } else if (i3 == 4) {
                this.curImgFilter.mo148397R1(bitmap2);
                arrayList.add(this.curImgFilter);
                arrayList.add(this.imageScaleWithColorChangingFilter);
                this.processFilter.m96813R1(arrayList);
                this.imageScaleWithColorChangingFilter.m154717R1();
            } else if (i3 == 5) {
                this.zoomFusionFilter.m154632Q1(bitmap, bitmap2);
                arrayList.add(this.zoomFusionFilter);
                this.processFilter.m96813R1(arrayList);
            } else if (i3 == 6) {
                this.rightToLeftGroupFilter.m217064Q1(bitmap, bitmap2);
                arrayList.add(this.rightToLeftGroupFilter);
                this.processFilter.m96813R1(arrayList);
            } else if (i3 == 7) {
                this.bottomToTopGroupFilter.m121017Q1(bitmap, bitmap2);
                arrayList.add(this.bottomToTopGroupFilter);
                this.processFilter.m96813R1(arrayList);
            } else if (i3 == 8) {
                this.albumTemplateGroupFilter.m174507Q1(bitmap, bitmap2);
                arrayList.add(this.albumTemplateGroupFilter);
                this.processFilter.m96813R1(arrayList);
            } else if (i3 == 9) {
                this.albumTemplateOverlapGroupFilter.m184140Q1(bitmap, bitmap2);
                arrayList.add(this.albumTemplateOverlapGroupFilter);
                this.processFilter.m96813R1(arrayList);
            } else if (i3 == 10) {
                this.curImgFilter.mo148397R1(bitmap2);
                arrayList.add(this.curImgFilter);
                arrayList.add(this.albumGrayFilter);
                this.processFilter.m96813R1(arrayList);
                this.albumGrayFilter.m154598Q1();
            } else if (i3 == 11) {
                this.curImgFilter.mo148397R1(bitmap2);
                arrayList.add(this.curImgFilter);
                arrayList.add(this.topShiftFilter);
                this.processFilter.m96813R1(arrayList);
                this.topShiftFilter.m196183Q1();
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // p149l.f7j0
    public void startPostWatermark(boolean z) {
        this.startPostWatermark = z;
    }

    @Override // p149l.f7j0
    public void startPreWatermark(boolean z) {
        this.startPreWatermark = z;
    }

    @Override // p149l.f7j0
    public void setTransFieldFilterListener(ug50 ug50Var) {
    }
}
