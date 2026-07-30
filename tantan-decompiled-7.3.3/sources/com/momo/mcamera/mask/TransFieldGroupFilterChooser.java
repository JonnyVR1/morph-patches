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
import p153l.ap50;
import p153l.bjm;
import p153l.cdd0;
import p153l.cm80;
import p153l.h5w;
import p153l.h6j;
import p153l.ih0;
import p153l.jgj0;
import p153l.jqf0;
import p153l.jt2;
import p153l.k6j;
import p153l.mh0;
import p153l.oae;
import p153l.ogj0;
import p153l.oh0;
import p153l.pdj;
import p153l.pe5;
import p153l.pkm;
import p153l.pqq0;
import p153l.pyi0;
import p153l.qh0;
import p153l.qj0;
import p153l.qv40;
import p153l.qyi0;
import p153l.rqq0;
import p153l.ryf0;
import p153l.ryi0;
import p153l.ue3;
import p153l.x43;
import p153l.y6j0;

/* JADX INFO: loaded from: classes8.dex */
public class TransFieldGroupFilterChooser extends jgj0 {
    private h5w lookupFilter;
    private cm80 mBasicFilterPost;
    private ImageMoveStickerMaskFilter mBasicFilterPre;
    private Bitmap mBitmap;
    ap50 mFilterListener;
    private bjm mImageMovePreStickerBlendFilter;
    private Bitmap mLookup;
    private Sticker mStickerPre;
    jqf0 processFilter;
    private int effectsCount = 5;
    private int effectIndex = 0;
    private int fixIndex = -1;
    private int softTransferIndex = 0;
    private boolean startPostWatermark = false;
    private boolean startPreWatermark = false;
    private boolean isFirstFrame = false;
    List<jt2> filterList = new ArrayList();
    rqq0 zoomFusionFilter = new rqq0();
    ryi0 threeStateInFilter = new ryi0();
    qyi0 threeStateEnterFilter = new qyi0();
    cdd0 rightToLeftGroupFilter = new cdd0();
    pyi0 threeGradualEffectFilter = new pyi0();
    h6j curImgFilter = new h6j();
    pkm imageScaleWithColorChangingFilter = new pkm();
    oae downwardWithColorFilter = new oae();
    ue3 bottomToTopGroupFilter = new ue3();
    oh0 albumTemplateOverlapGroupFilter = new oh0();
    mh0 albumTemplateGroupFilter = new mh0();
    ih0 albumGrayFilter = new ih0();
    qh0 albumTemplateVerticalGroupFilter = new qh0();
    y6j0 topShiftFilter = new y6j0();
    pqq0 zoomEffectGroupFilter = new pqq0();
    pdj fuzzyGradShiftFilter = new pdj();
    h6j frameAdpterBlurFilter = new h6j();

    public TransFieldGroupFilterChooser() {
        this.filterList.add(new qv40());
        jqf0 jqf0Var = new jqf0(this.filterList);
        this.processFilter = jqf0Var;
        jqf0Var.m146577Q1(false);
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
            MDLog.m7445e(MDLogTag.MOMENT_PICMOVIE_TAG, e.toString());
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

    private boolean processFirstFrame(Bitmap bitmap, Bitmap bitmap2, List<jt2> list) {
        bjm bjmVar;
        ImageMoveStickerMaskFilter imageMoveStickerMaskFilter;
        if (this.startPreWatermark) {
            h5w h5wVar = new h5w();
            this.lookupFilter = h5wVar;
            Bitmap bitmap3 = this.mLookup;
            if (bitmap3 != null) {
                h5wVar.setLookupBitmap(bitmap3);
            }
            if (this.mImageMovePreStickerBlendFilter == null && (imageMoveStickerMaskFilter = this.mBasicFilterPre) != null && this.mStickerPre != null) {
                this.mImageMovePreStickerBlendFilter = new bjm(imageMoveStickerMaskFilter);
            }
            Sticker sticker = this.mStickerPre;
            if (sticker != null && (bjmVar = this.mImageMovePreStickerBlendFilter) != null) {
                sticker.curIndex = 0;
                bjmVar.m104631Q1(sticker.getBlendMode().name);
            }
            if ((bitmap == null && this.mImageMovePreStickerBlendFilter != null && this.startPreWatermark) || (this.isFirstFrame && this.startPreWatermark)) {
                int i = this.fixIndex;
                if (i == -3) {
                    this.fuzzyGradShiftFilter.m171880a2();
                    this.frameAdpterBlurFilter.mo129266R1(bitmap2);
                    this.fuzzyGradShiftFilter.m171872S1(0.8f);
                    this.fuzzyGradShiftFilter.m171874U1(0.0025f);
                    list.add(this.frameAdpterBlurFilter);
                    list.add(this.fuzzyGradShiftFilter);
                    if (this.mLookup != null) {
                        list.add(this.lookupFilter);
                    }
                    bjm bjmVar2 = this.mImageMovePreStickerBlendFilter;
                    if (bjmVar2 != null && this.mBasicFilterPre != null && this.mStickerPre != null) {
                        bjmVar2.m104632R1();
                        this.mImageMovePreStickerBlendFilter.m104633S1(0.0f);
                        list.add(this.mImageMovePreStickerBlendFilter);
                    }
                    this.processFilter.m146578R1(list);
                    this.isFirstFrame = false;
                    return true;
                }
                if (i == -4) {
                    this.fuzzyGradShiftFilter.m171880a2();
                    this.frameAdpterBlurFilter.mo129266R1(bitmap2);
                    this.fuzzyGradShiftFilter.m171871R1(0.8f);
                    this.fuzzyGradShiftFilter.m171874U1(-0.0025f);
                    list.add(this.frameAdpterBlurFilter);
                    list.add(this.fuzzyGradShiftFilter);
                    if (this.mLookup != null) {
                        list.add(this.lookupFilter);
                    }
                    bjm bjmVar3 = this.mImageMovePreStickerBlendFilter;
                    if (bjmVar3 != null && this.mBasicFilterPre != null && this.mStickerPre != null) {
                        bjmVar3.m104632R1();
                        this.mImageMovePreStickerBlendFilter.m104633S1(0.0f);
                        list.add(this.mImageMovePreStickerBlendFilter);
                    }
                    this.processFilter.m146578R1(list);
                    this.isFirstFrame = false;
                    return true;
                }
            }
        } else if (bitmap == null) {
            this.curImgFilter.mo129266R1(bitmap2);
            list.add(this.curImgFilter);
            this.processFilter.m146578R1(list);
            this.isFirstFrame = false;
            return true;
        }
        return false;
    }

    private void quickTransferTemplate(Bitmap bitmap, Bitmap bitmap2) {
        cm80 cm80Var;
        cm80 cm80Var2;
        cm80 cm80Var3;
        cm80 cm80Var4;
        cm80 cm80Var5;
        cm80 cm80Var6;
        cm80 cm80Var7;
        cm80 cm80Var8;
        cm80 cm80Var9;
        ArrayList arrayList = new ArrayList();
        int i = (this.softTransferIndex + 1) % 10;
        this.softTransferIndex = i;
        switch (i) {
            case 1:
                this.fuzzyGradShiftFilter.m171880a2();
                this.frameAdpterBlurFilter.mo129266R1(bitmap2);
                arrayList.add(this.frameAdpterBlurFilter);
                arrayList.add(this.fuzzyGradShiftFilter);
                if (!this.startPostWatermark || (cm80Var = this.mBasicFilterPost) == null) {
                    ogj0 ogj0Var = new ogj0();
                    ogj0Var.m167651Q1();
                    arrayList.add(ogj0Var);
                    ogj0Var.m167651Q1();
                } else {
                    cm80Var.m111087T1();
                    this.mBasicFilterPost.m111093Z1(3.0f);
                    this.mBasicFilterPost.setAlpha(0.4f);
                    this.mBasicFilterPost.m111088U1(0.08f);
                    this.mBasicFilterPost.m111091X1(0.05f, 0.5f);
                    arrayList.add(this.mBasicFilterPost);
                }
                this.processFilter.m146578R1(arrayList);
                this.fuzzyGradShiftFilter.m171872S1(0.7f);
                this.fuzzyGradShiftFilter.m171878Y1(true);
                break;
            case 2:
                qj0 qj0Var = new qj0();
                qj0Var.m176800W1();
                this.fuzzyGradShiftFilter.m171880a2();
                qj0Var.setBackgroundColour(1.0f, 1.0f, 1.0f, 1.0f);
                this.frameAdpterBlurFilter.mo129266R1(bitmap2);
                arrayList.add(this.frameAdpterBlurFilter);
                arrayList.add(this.fuzzyGradShiftFilter);
                if (this.startPostWatermark && (cm80Var2 = this.mBasicFilterPost) != null) {
                    cm80Var2.m111087T1();
                    this.mBasicFilterPost.m111093Z1(3.0f);
                    this.mBasicFilterPost.setAlpha(0.4f);
                    this.mBasicFilterPost.m111088U1(0.08f);
                    this.mBasicFilterPost.m111091X1(0.05f, 0.5f);
                    arrayList.add(this.mBasicFilterPost);
                }
                arrayList.add(qj0Var);
                this.processFilter.m146578R1(arrayList);
                qj0Var.m176794Q1(0.0f);
                qj0Var.m176795R1(0.016f);
                qj0Var.m176796S1(0.6f);
                this.fuzzyGradShiftFilter.m171879Z1(1.1f);
                this.fuzzyGradShiftFilter.m171876W1(0.0013f);
                this.fuzzyGradShiftFilter.m171875V1(0.0f);
                break;
            case 3:
                qj0 qj0Var2 = new qj0();
                qj0Var2.m176800W1();
                this.fuzzyGradShiftFilter.m171880a2();
                qj0Var2.setBackgroundColour(0.0f, 0.0f, 0.0f, 0.0f);
                this.frameAdpterBlurFilter.mo129266R1(bitmap2);
                arrayList.add(this.frameAdpterBlurFilter);
                arrayList.add(this.fuzzyGradShiftFilter);
                if (this.startPostWatermark && (cm80Var3 = this.mBasicFilterPost) != null) {
                    cm80Var3.m111087T1();
                    this.mBasicFilterPost.m111093Z1(3.0f);
                    this.mBasicFilterPost.setAlpha(0.4f);
                    this.mBasicFilterPost.m111088U1(0.08f);
                    this.mBasicFilterPost.m111091X1(0.05f, 0.5f);
                    arrayList.add(this.mBasicFilterPost);
                }
                arrayList.add(qj0Var2);
                this.processFilter.m146578R1(arrayList);
                qj0Var2.m176797T1(2.5f);
                qj0Var2.m176799V1(0.6f);
                qj0Var2.m176798U1(0.057f);
                this.fuzzyGradShiftFilter.m171872S1(1.0f);
                this.fuzzyGradShiftFilter.m171871R1(0.7f);
                this.fuzzyGradShiftFilter.m171874U1(-0.004f);
                break;
            case 4:
                x43 x43Var = new x43();
                x43Var.m209300R1();
                this.fuzzyGradShiftFilter.m171880a2();
                this.frameAdpterBlurFilter.mo129266R1(bitmap2);
                arrayList.add(this.frameAdpterBlurFilter);
                arrayList.add(this.fuzzyGradShiftFilter);
                arrayList.add(x43Var);
                if (this.startPostWatermark && (cm80Var4 = this.mBasicFilterPost) != null) {
                    cm80Var4.m111087T1();
                    this.mBasicFilterPost.m111093Z1(3.0f);
                    this.mBasicFilterPost.setAlpha(0.4f);
                    this.mBasicFilterPost.m111088U1(0.08f);
                    this.mBasicFilterPost.m111091X1(0.05f, 0.5f);
                    arrayList.add(this.mBasicFilterPost);
                }
                this.processFilter.m146578R1(arrayList);
                x43Var.m209299Q1(0.0f);
                this.fuzzyGradShiftFilter.m171872S1(0.88f);
                this.fuzzyGradShiftFilter.m171874U1(0.0016f);
                break;
            case 5:
                qj0 qj0Var3 = new qj0();
                qj0Var3.m176800W1();
                this.fuzzyGradShiftFilter.m171880a2();
                qj0Var3.setBackgroundColour(0.0f, 0.0f, 0.0f, 0.0f);
                this.frameAdpterBlurFilter.mo129266R1(bitmap2);
                arrayList.add(this.frameAdpterBlurFilter);
                arrayList.add(this.fuzzyGradShiftFilter);
                if (this.startPostWatermark && (cm80Var5 = this.mBasicFilterPost) != null) {
                    cm80Var5.m111087T1();
                    this.mBasicFilterPost.m111093Z1(3.0f);
                    this.mBasicFilterPost.setAlpha(0.4f);
                    this.mBasicFilterPost.m111088U1(0.08f);
                    this.mBasicFilterPost.m111091X1(0.05f, 0.5f);
                    arrayList.add(this.mBasicFilterPost);
                }
                arrayList.add(qj0Var3);
                this.processFilter.m146578R1(arrayList);
                qj0Var3.m176797T1(2.0f);
                qj0Var3.m176799V1(0.6f);
                qj0Var3.m176798U1(0.016f);
                this.fuzzyGradShiftFilter.m171872S1(1.0f);
                this.fuzzyGradShiftFilter.m171871R1(0.5f);
                this.fuzzyGradShiftFilter.m171874U1(-0.0067f);
                break;
            case 6:
                this.fuzzyGradShiftFilter.m171880a2();
                this.frameAdpterBlurFilter.mo129266R1(bitmap2);
                arrayList.add(this.frameAdpterBlurFilter);
                arrayList.add(this.fuzzyGradShiftFilter);
                if (this.startPostWatermark && (cm80Var6 = this.mBasicFilterPost) != null) {
                    cm80Var6.m111087T1();
                    this.mBasicFilterPost.m111093Z1(3.0f);
                    this.mBasicFilterPost.setAlpha(0.4f);
                    this.mBasicFilterPost.m111088U1(0.08f);
                    this.mBasicFilterPost.m111091X1(0.05f, 0.5f);
                    arrayList.add(this.mBasicFilterPost);
                }
                this.processFilter.m146578R1(arrayList);
                this.fuzzyGradShiftFilter.m171872S1(1.0f);
                this.fuzzyGradShiftFilter.m171871R1(0.8f);
                this.fuzzyGradShiftFilter.m171874U1(-0.0027f);
                break;
            case 7:
                qj0 qj0Var4 = new qj0();
                qj0 qj0Var5 = new qj0();
                qj0Var4.m176800W1();
                qj0Var5.m176800W1();
                this.zoomEffectGroupFilter.m173390Z1(bitmap, bitmap2);
                arrayList.add(this.zoomEffectGroupFilter);
                if (this.startPostWatermark && (cm80Var7 = this.mBasicFilterPost) != null) {
                    cm80Var7.m111087T1();
                    this.mBasicFilterPost.m111093Z1(3.0f);
                    this.mBasicFilterPost.setAlpha(0.4f);
                    this.mBasicFilterPost.m111088U1(0.08f);
                    this.mBasicFilterPost.m111091X1(0.05f, 0.5f);
                    arrayList.add(this.mBasicFilterPost);
                }
                arrayList.add(qj0Var4);
                arrayList.add(qj0Var5);
                this.processFilter.m146578R1(arrayList);
                qj0Var4.m176797T1(0.0f);
                qj0Var4.m176799V1(0.6f);
                qj0Var4.m176798U1(-0.04f);
                this.zoomEffectGroupFilter.m173381Q1(1.2f);
                this.zoomEffectGroupFilter.m173382R1(0.8f);
                this.zoomEffectGroupFilter.m173383S1(0.02f);
                this.zoomEffectGroupFilter.m173384T1(1.2f);
                this.zoomEffectGroupFilter.m173385U1(0.003f);
                qj0Var5.m176797T1(2.4f);
                qj0Var5.m176799V1(0.0f);
                qj0Var5.m176798U1(0.067f);
                break;
            case 8:
                ryf0 ryf0Var = new ryf0();
                ryf0Var.m183605S1();
                this.fuzzyGradShiftFilter.m171880a2();
                this.frameAdpterBlurFilter.mo129266R1(bitmap2);
                arrayList.add(this.frameAdpterBlurFilter);
                arrayList.add(this.fuzzyGradShiftFilter);
                arrayList.add(ryf0Var);
                if (this.startPostWatermark && (cm80Var8 = this.mBasicFilterPost) != null) {
                    cm80Var8.m111087T1();
                    this.mBasicFilterPost.m111093Z1(3.0f);
                    this.mBasicFilterPost.setAlpha(0.4f);
                    this.mBasicFilterPost.m111088U1(0.08f);
                    this.mBasicFilterPost.m111091X1(0.05f, 0.5f);
                    arrayList.add(this.mBasicFilterPost);
                }
                this.processFilter.m146578R1(arrayList);
                ryf0Var.m183604R1(0.0f);
                ryf0Var.m183603Q1(0.083f);
                this.fuzzyGradShiftFilter.m171872S1(1.0f);
                this.fuzzyGradShiftFilter.m171871R1(0.7f);
                this.fuzzyGradShiftFilter.m171874U1(-0.005f);
                this.fuzzyGradShiftFilter.m171877X1(0.6f);
                break;
            case 9:
                pe5 pe5Var = new pe5();
                pe5Var.m171920U1();
                pe5Var.m171919T1(3.0f);
                this.zoomEffectGroupFilter.m173390Z1(bitmap, bitmap2);
                arrayList.add(this.zoomEffectGroupFilter);
                this.zoomEffectGroupFilter.m173382R1(0.8f);
                this.zoomEffectGroupFilter.m173383S1(0.02f);
                this.zoomEffectGroupFilter.m173384T1(1.0f);
                this.zoomEffectGroupFilter.m173385U1(0.0f);
                this.zoomEffectGroupFilter.m173386V1(0.5f);
                this.zoomEffectGroupFilter.m173387W1(0.0f);
                this.zoomEffectGroupFilter.m173381Q1(1.3f);
                this.zoomEffectGroupFilter.m173392b2(1.1f);
                this.zoomEffectGroupFilter.m173388X1(0.5f);
                this.zoomEffectGroupFilter.m173389Y1(0.0014f);
                arrayList.add(pe5Var);
                if (this.startPostWatermark && (cm80Var9 = this.mBasicFilterPost) != null) {
                    cm80Var9.m111087T1();
                    this.mBasicFilterPost.m111093Z1(3.8f);
                    this.mBasicFilterPost.setAlpha(0.4f);
                    this.mBasicFilterPost.m111088U1(0.08f);
                    this.mBasicFilterPost.m111091X1(0.05f, 0.5f);
                    arrayList.add(this.mBasicFilterPost);
                }
                this.processFilter.m146578R1(arrayList);
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
        cm80 cm80Var;
        cm80 cm80Var2;
        cm80 cm80Var3;
        cm80 cm80Var4;
        cm80 cm80Var5;
        cm80 cm80Var6;
        cm80 cm80Var7;
        cm80 cm80Var8;
        cm80 cm80Var9;
        ArrayList arrayList = new ArrayList();
        qj0 qj0Var = new qj0();
        qj0Var.setBackgroundColour(1.0f, 1.0f, 1.0f, 1.0f);
        int i = (this.softTransferIndex + 1) % 10;
        this.softTransferIndex = i;
        switch (i) {
            case 1:
                this.zoomEffectGroupFilter.m173390Z1(bitmap, bitmap2);
                arrayList.add(this.zoomEffectGroupFilter);
                if (this.startPostWatermark && (cm80Var = this.mBasicFilterPost) != null) {
                    cm80Var.m111087T1();
                    this.mBasicFilterPost.m111093Z1(3.0f);
                    this.mBasicFilterPost.setAlpha(0.5f);
                    this.mBasicFilterPost.m111088U1(0.02f);
                    this.mBasicFilterPost.m111089V1(0.95f, 0.95f);
                    this.mBasicFilterPost.m111091X1(0.98f, 0.95f);
                    this.mBasicFilterPost.m111090W1(-0.008f);
                    arrayList.add(this.mBasicFilterPost);
                }
                this.processFilter.m146578R1(arrayList);
                this.zoomEffectGroupFilter.m173382R1(0.8f);
                this.zoomEffectGroupFilter.m173383S1(0.016f);
                this.zoomEffectGroupFilter.m173384T1(1.3f);
                this.zoomEffectGroupFilter.m173385U1(0.004f);
                this.zoomEffectGroupFilter.m173386V1(0.5f);
                this.zoomEffectGroupFilter.m173387W1(0.0f);
                this.zoomEffectGroupFilter.m173381Q1(1.0f);
                this.zoomEffectGroupFilter.m173392b2(1.0f);
                break;
            case 2:
                qj0Var.m176800W1();
                qj0Var.m176794Q1(0.0f);
                this.zoomEffectGroupFilter.m173390Z1(bitmap, bitmap2);
                arrayList.add(this.zoomEffectGroupFilter);
                if (!this.startPostWatermark || (cm80Var2 = this.mBasicFilterPost) == null) {
                    this.zoomEffectGroupFilter.m173391a2(true, 0);
                } else {
                    cm80Var2.m111087T1();
                    this.mBasicFilterPost.m111093Z1(3.0f);
                    this.mBasicFilterPost.setAlpha(0.5f);
                    this.mBasicFilterPost.m111088U1(0.02f);
                    this.mBasicFilterPost.m111089V1(0.95f, 0.95f);
                    this.mBasicFilterPost.m111091X1(0.98f, 0.95f);
                    this.mBasicFilterPost.m111090W1(-0.008f);
                    arrayList.add(this.mBasicFilterPost);
                    this.zoomEffectGroupFilter.m173391a2(false, 0);
                }
                arrayList.add(qj0Var);
                this.processFilter.m146578R1(arrayList);
                this.zoomEffectGroupFilter.m173382R1(0.8f);
                this.zoomEffectGroupFilter.m173383S1(0.016f);
                this.zoomEffectGroupFilter.m173384T1(1.2f);
                this.zoomEffectGroupFilter.m173385U1(-0.003f);
                this.zoomEffectGroupFilter.m173386V1(0.5f);
                this.zoomEffectGroupFilter.m173387W1(0.0f);
                this.zoomEffectGroupFilter.m173381Q1(1.0f);
                this.zoomEffectGroupFilter.m173392b2(1.0f);
                qj0Var.m176796S1(0.8f);
                qj0Var.m176795R1(0.006f);
                break;
            case 3:
                qj0Var.m176800W1();
                qj0Var.m176794Q1(0.0f);
                this.zoomEffectGroupFilter.m173390Z1(bitmap, bitmap2);
                arrayList.add(this.zoomEffectGroupFilter);
                if (this.startPostWatermark && (cm80Var3 = this.mBasicFilterPost) != null) {
                    cm80Var3.m111087T1();
                    this.mBasicFilterPost.m111093Z1(3.0f);
                    this.mBasicFilterPost.setAlpha(0.5f);
                    this.mBasicFilterPost.m111088U1(0.02f);
                    this.mBasicFilterPost.m111089V1(0.95f, 0.95f);
                    this.mBasicFilterPost.m111091X1(0.98f, 0.95f);
                    this.mBasicFilterPost.m111090W1(-0.008f);
                    arrayList.add(this.mBasicFilterPost);
                }
                arrayList.add(qj0Var);
                this.processFilter.m146578R1(arrayList);
                this.zoomEffectGroupFilter.m173382R1(0.9f);
                this.zoomEffectGroupFilter.m173383S1(0.01f);
                this.zoomEffectGroupFilter.m173384T1(1.0f);
                this.zoomEffectGroupFilter.m173385U1(0.0f);
                this.zoomEffectGroupFilter.m173386V1(0.5f);
                this.zoomEffectGroupFilter.m173387W1(0.0025f);
                this.zoomEffectGroupFilter.m173381Q1(1.2f);
                this.zoomEffectGroupFilter.m173392b2(1.2f);
                qj0Var.m176796S1(0.7f);
                qj0Var.m176795R1(0.03f);
                this.zoomEffectGroupFilter.m173391a2(true, 1);
                break;
            case 4:
                this.zoomEffectGroupFilter.m173390Z1(bitmap, bitmap2);
                arrayList.add(this.zoomEffectGroupFilter);
                if (this.startPostWatermark && (cm80Var4 = this.mBasicFilterPost) != null) {
                    cm80Var4.m111087T1();
                    this.mBasicFilterPost.m111093Z1(3.0f);
                    this.mBasicFilterPost.setAlpha(0.5f);
                    this.mBasicFilterPost.m111088U1(0.02f);
                    this.mBasicFilterPost.m111089V1(0.95f, 0.95f);
                    this.mBasicFilterPost.m111091X1(0.98f, 0.95f);
                    this.mBasicFilterPost.m111090W1(-0.008f);
                    arrayList.add(this.mBasicFilterPost);
                }
                this.processFilter.m146578R1(arrayList);
                this.zoomEffectGroupFilter.m173382R1(0.95f);
                this.zoomEffectGroupFilter.m173383S1(0.01f);
                this.zoomEffectGroupFilter.m173384T1(1.2f);
                this.zoomEffectGroupFilter.m173385U1(-0.0026f);
                this.zoomEffectGroupFilter.m173386V1(0.5f);
                this.zoomEffectGroupFilter.m173387W1(0.0f);
                this.zoomEffectGroupFilter.m173381Q1(1.0f);
                this.zoomEffectGroupFilter.m173392b2(1.0f);
                break;
            case 5:
                qj0Var.m176800W1();
                qj0Var.m176794Q1(0.0f);
                this.zoomEffectGroupFilter.m173390Z1(bitmap, bitmap2);
                arrayList.add(this.zoomEffectGroupFilter);
                if (this.startPostWatermark && (cm80Var5 = this.mBasicFilterPost) != null) {
                    cm80Var5.m111087T1();
                    this.mBasicFilterPost.m111093Z1(3.0f);
                    this.mBasicFilterPost.setAlpha(0.5f);
                    this.mBasicFilterPost.m111088U1(0.02f);
                    this.mBasicFilterPost.m111089V1(0.95f, 0.95f);
                    this.mBasicFilterPost.m111091X1(0.98f, 0.95f);
                    this.mBasicFilterPost.m111090W1(-0.008f);
                    arrayList.add(this.mBasicFilterPost);
                }
                arrayList.add(qj0Var);
                this.processFilter.m146578R1(arrayList);
                this.zoomEffectGroupFilter.m173382R1(0.8f);
                this.zoomEffectGroupFilter.m173383S1(0.016f);
                this.zoomEffectGroupFilter.m173384T1(1.2f);
                this.zoomEffectGroupFilter.m173385U1(0.0026f);
                this.zoomEffectGroupFilter.m173386V1(0.5f);
                this.zoomEffectGroupFilter.m173387W1(0.0f);
                this.zoomEffectGroupFilter.m173381Q1(1.0f);
                this.zoomEffectGroupFilter.m173392b2(1.0f);
                qj0Var.m176796S1(0.8f);
                qj0Var.m176795R1(0.04f);
                break;
            case 6:
                this.zoomEffectGroupFilter.m173390Z1(bitmap, bitmap2);
                arrayList.add(this.zoomEffectGroupFilter);
                if (this.startPostWatermark && (cm80Var6 = this.mBasicFilterPost) != null) {
                    cm80Var6.m111087T1();
                    this.mBasicFilterPost.m111087T1();
                    this.mBasicFilterPost.m111093Z1(3.0f);
                    this.mBasicFilterPost.setAlpha(0.5f);
                    this.mBasicFilterPost.m111088U1(0.02f);
                    this.mBasicFilterPost.m111089V1(0.95f, 0.95f);
                    this.mBasicFilterPost.m111091X1(0.98f, 0.95f);
                    this.mBasicFilterPost.m111090W1(-0.008f);
                    arrayList.add(this.mBasicFilterPost);
                }
                this.processFilter.m146578R1(arrayList);
                this.zoomEffectGroupFilter.m173382R1(0.9f);
                this.zoomEffectGroupFilter.m173383S1(0.008f);
                this.zoomEffectGroupFilter.m173384T1(1.0f);
                this.zoomEffectGroupFilter.m173385U1(0.0f);
                this.zoomEffectGroupFilter.m173386V1(0.5f);
                this.zoomEffectGroupFilter.m173387W1(0.0026f);
                this.zoomEffectGroupFilter.m173381Q1(1.0f);
                this.zoomEffectGroupFilter.m173392b2(1.2f);
                break;
            case 7:
                this.zoomEffectGroupFilter.m173390Z1(bitmap, bitmap2);
                arrayList.add(this.zoomEffectGroupFilter);
                if (this.startPostWatermark && (cm80Var7 = this.mBasicFilterPost) != null) {
                    cm80Var7.m111087T1();
                    this.mBasicFilterPost.m111093Z1(3.0f);
                    this.mBasicFilterPost.setAlpha(0.5f);
                    this.mBasicFilterPost.m111088U1(0.02f);
                    this.mBasicFilterPost.m111089V1(0.95f, 0.95f);
                    this.mBasicFilterPost.m111091X1(0.98f, 0.95f);
                    this.mBasicFilterPost.m111090W1(-0.008f);
                    arrayList.add(this.mBasicFilterPost);
                }
                this.processFilter.m146578R1(arrayList);
                this.zoomEffectGroupFilter.m173382R1(0.85f);
                this.zoomEffectGroupFilter.m173383S1(0.012f);
                this.zoomEffectGroupFilter.m173384T1(1.2f);
                this.zoomEffectGroupFilter.m173385U1(-0.0026f);
                this.zoomEffectGroupFilter.m173386V1(0.5f);
                this.zoomEffectGroupFilter.m173387W1(0.0f);
                this.zoomEffectGroupFilter.m173381Q1(1.0f);
                this.zoomEffectGroupFilter.m173392b2(1.0f);
                break;
            case 8:
                this.zoomEffectGroupFilter.m173390Z1(bitmap, bitmap2);
                arrayList.add(this.zoomEffectGroupFilter);
                if (this.startPostWatermark && (cm80Var8 = this.mBasicFilterPost) != null) {
                    cm80Var8.m111087T1();
                    this.mBasicFilterPost.m111093Z1(3.0f);
                    this.mBasicFilterPost.setAlpha(0.5f);
                    this.mBasicFilterPost.m111088U1(0.02f);
                    this.mBasicFilterPost.m111089V1(0.95f, 0.95f);
                    this.mBasicFilterPost.m111091X1(0.98f, 0.95f);
                    this.mBasicFilterPost.m111090W1(-0.008f);
                    arrayList.add(this.mBasicFilterPost);
                }
                this.processFilter.m146578R1(arrayList);
                this.zoomEffectGroupFilter.m173382R1(0.95f);
                this.zoomEffectGroupFilter.m173383S1(0.001f);
                this.zoomEffectGroupFilter.m173384T1(1.0f);
                this.zoomEffectGroupFilter.m173385U1(0.0f);
                this.zoomEffectGroupFilter.m173386V1(0.5f);
                this.zoomEffectGroupFilter.m173387W1(0.0026f);
                this.zoomEffectGroupFilter.m173381Q1(1.0f);
                this.zoomEffectGroupFilter.m173392b2(1.2f);
                break;
            case 9:
                this.zoomEffectGroupFilter.m173390Z1(bitmap, bitmap2);
                arrayList.add(this.zoomEffectGroupFilter);
                if (this.startPostWatermark && (cm80Var9 = this.mBasicFilterPost) != null) {
                    cm80Var9.m111087T1();
                    this.mBasicFilterPost.m111093Z1(3.0f);
                    this.mBasicFilterPost.setAlpha(0.5f);
                    this.mBasicFilterPost.m111088U1(0.02f);
                    this.mBasicFilterPost.m111089V1(0.95f, 0.95f);
                    this.mBasicFilterPost.m111091X1(0.98f, 0.95f);
                    this.mBasicFilterPost.m111090W1(-0.008f);
                    arrayList.add(this.mBasicFilterPost);
                }
                this.processFilter.m146578R1(arrayList);
                this.zoomEffectGroupFilter.m173382R1(0.95f);
                this.zoomEffectGroupFilter.m173383S1(0.001f);
                this.zoomEffectGroupFilter.m173384T1(1.2f);
                this.zoomEffectGroupFilter.m173385U1(-0.0026f);
                this.zoomEffectGroupFilter.m173386V1(0.5f);
                this.zoomEffectGroupFilter.m173387W1(0.0f);
                this.zoomEffectGroupFilter.m173381Q1(1.0f);
                this.zoomEffectGroupFilter.m173392b2(1.2f);
                break;
        }
    }

    @Override // p153l.jgj0
    public jt2 getVideoProcessFilter() {
        return this.processFilter;
    }

    @Override // p153l.jgj0
    public void lockCoverFrame(Bitmap bitmap, k6j.InterfaceC18110a interfaceC18110a) {
        if (bitmap == null) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        h6j h6jVar = this.curImgFilter;
        if (h6jVar == null || this.processFilter == null) {
            return;
        }
        h6jVar.mo129266R1(bitmap);
        arrayList.add(this.curImgFilter);
        k6j k6jVar = new k6j();
        k6jVar.m148517Q1(interfaceC18110a);
        arrayList.add(k6jVar);
        this.processFilter.m146578R1(arrayList);
    }

    @Override // p153l.jgj0
    public synchronized void lockFrame(Bitmap bitmap) {
        if (bitmap == null) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        h6j h6jVar = this.curImgFilter;
        if (h6jVar != null && this.processFilter != null) {
            h6jVar.mo129266R1(bitmap);
            arrayList.add(this.curImgFilter);
            this.processFilter.m146578R1(arrayList);
        }
    }

    @Override // p153l.jgj0
    public void reset() {
        setEffectIndex(this.fixIndex);
    }

    public void setEffectBottomToTop() {
        setEffectIndex(jgj0.FILTER_BOTTOM_TO_TOP_INDEX);
    }

    public void setEffectDiffusion() {
        setEffectIndex(jgj0.FILTER_DIFFUSION_INDEX);
    }

    public void setEffectRightToLeft() {
        setEffectIndex(jgj0.FILTER_RIGHT_TO_LEFT_INDEX);
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
        cm80 cm80Var = new cm80();
        this.mBasicFilterPost = cm80Var;
        cm80Var.m111092Y1(this.mBitmap);
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
        cm80 cm80Var = new cm80();
        this.mBasicFilterPost = cm80Var;
        cm80Var.m111092Y1(this.mBitmap);
        this.startPostWatermark = true;
        this.startPreWatermark = true;
    }

    @Override // p153l.jgj0
    public void setFrameRate(int i) {
        this.zoomFusionFilter.setFrameRate(25);
        this.rightToLeftGroupFilter.setFrameRate(25);
        this.bottomToTopGroupFilter.setFrameRate(25);
    }

    public void setLookupPath(String str) {
        oae oaeVar = this.downwardWithColorFilter;
        if (oaeVar != null) {
            oaeVar.setLookupPath(str);
        }
        pkm pkmVar = this.imageScaleWithColorChangingFilter;
        if (pkmVar != null) {
            pkmVar.setLookupPath(str);
        }
        pyi0 pyi0Var = this.threeGradualEffectFilter;
        if (pyi0Var != null) {
            pyi0Var.setLookupPath(str);
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
                this.threeGradualEffectFilter.m174289R1(bitmap, bitmap2);
                arrayList.add(this.threeGradualEffectFilter);
                this.processFilter.m146578R1(arrayList);
            } else if (i3 == 1) {
                this.curImgFilter.mo129266R1(bitmap2);
                arrayList.add(this.curImgFilter);
                arrayList.add(this.threeStateInFilter);
                this.processFilter.m146578R1(arrayList);
                this.threeStateInFilter.m183609Q1();
            } else if (i3 == 2) {
                this.downwardWithColorFilter.m166831R1(bitmap, bitmap2);
                arrayList.add(this.downwardWithColorFilter);
                this.processFilter.m146578R1(arrayList);
            } else if (i3 == 3) {
                this.curImgFilter.mo129266R1(bitmap2);
                arrayList.add(this.curImgFilter);
                arrayList.add(this.threeStateEnterFilter);
                this.processFilter.m146578R1(arrayList);
                this.threeStateEnterFilter.m178650Q1();
            } else if (i3 == 4) {
                this.curImgFilter.mo129266R1(bitmap2);
                arrayList.add(this.curImgFilter);
                arrayList.add(this.imageScaleWithColorChangingFilter);
                this.processFilter.m146578R1(arrayList);
                this.imageScaleWithColorChangingFilter.m172613R1();
            } else if (i3 == 5) {
                this.zoomFusionFilter.m182672Q1(bitmap, bitmap2);
                arrayList.add(this.zoomFusionFilter);
                this.processFilter.m146578R1(arrayList);
            } else if (i3 == 6) {
                this.rightToLeftGroupFilter.m109164Q1(bitmap, bitmap2);
                arrayList.add(this.rightToLeftGroupFilter);
                this.processFilter.m146578R1(arrayList);
            } else if (i3 == 7) {
                this.bottomToTopGroupFilter.m195598Q1(bitmap, bitmap2);
                arrayList.add(this.bottomToTopGroupFilter);
                this.processFilter.m146578R1(arrayList);
            } else if (i3 == 8) {
                this.albumTemplateGroupFilter.m158396Q1(bitmap, bitmap2);
                arrayList.add(this.albumTemplateGroupFilter);
                this.processFilter.m146578R1(arrayList);
            } else if (i3 == 9) {
                this.albumTemplateOverlapGroupFilter.m167676Q1(bitmap, bitmap2);
                arrayList.add(this.albumTemplateOverlapGroupFilter);
                this.processFilter.m146578R1(arrayList);
            } else if (i3 == 10) {
                this.curImgFilter.mo129266R1(bitmap2);
                arrayList.add(this.curImgFilter);
                arrayList.add(this.albumGrayFilter);
                this.processFilter.m146578R1(arrayList);
                this.albumGrayFilter.m139966Q1();
            } else if (i3 == 11) {
                this.curImgFilter.mo129266R1(bitmap2);
                arrayList.add(this.curImgFilter);
                arrayList.add(this.topShiftFilter);
                this.processFilter.m146578R1(arrayList);
                this.topShiftFilter.m214485Q1();
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // p153l.jgj0
    public void startPostWatermark(boolean z) {
        this.startPostWatermark = z;
    }

    @Override // p153l.jgj0
    public void startPreWatermark(boolean z) {
        this.startPreWatermark = z;
    }

    @Override // p153l.jgj0
    public void setTransFieldFilterListener(ap50 ap50Var) {
    }
}
