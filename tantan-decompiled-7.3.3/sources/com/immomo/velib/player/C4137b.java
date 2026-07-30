package com.immomo.velib.player;

import android.graphics.Bitmap;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.clevertap.android.sdk.Constants;
import com.immomo.velib.anim.model.Element;
import com.immomo.velib.anim.model.VideoEffectModel;
import java.util.ArrayList;
import java.util.List;
import p153l.dam;
import p153l.dkl0;
import p153l.gre;
import p153l.l33;
import p153l.nre;

/* JADX INFO: renamed from: com.immomo.velib.player.b */
/* JADX INFO: loaded from: classes7.dex */
public class C4137b {

    /* JADX INFO: renamed from: a */
    private gre f14906a;

    /* JADX INFO: renamed from: b */
    private boolean f14907b = false;

    /* JADX INFO: renamed from: c */
    private String f14908c = "";

    /* JADX INFO: renamed from: com.immomo.velib.player.b$a */
    public class a implements Runnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ VideoEffectModel f14909a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ dam f14910b;

        public a(VideoEffectModel videoEffectModel, dam damVar) {
            this.f14909a = videoEffectModel;
            this.f14910b = damVar;
        }

        @Override // java.lang.Runnable
        public void run() throws Throwable {
            List<Element> elements = this.f14909a.getElements();
            List<dkl0> arrayList = new ArrayList<>(16);
            if (elements != null && !elements.isEmpty()) {
                arrayList = C4137b.this.m20556c(this.f14909a, elements);
            }
            this.f14910b.onEffectElementComplete(arrayList);
        }
    }

    /* JADX INFO: renamed from: com.immomo.velib.player.b$b */
    public class b implements Runnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ VideoEffectModel f14912a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ dam f14913b;

        public b(VideoEffectModel videoEffectModel, dam damVar) {
            this.f14912a = videoEffectModel;
            this.f14913b = damVar;
        }

        @Override // java.lang.Runnable
        public void run() throws Throwable {
            ArrayList arrayList = new ArrayList(16);
            if (this.f14912a.getAvatar() != null) {
                this.f14912a.getAvatar().setType(1);
                this.f14912a.getAvatar().useCircle = true;
                dkl0 dkl0VarM20557d = C4137b.this.m20557d(this.f14912a.getAvatar(), this.f14912a.getWidth(), this.f14912a.getHeight(), this.f14912a.getOriginVideoWidth());
                if (dkl0VarM20557d != null) {
                    arrayList.add(dkl0VarM20557d);
                }
            }
            if (this.f14912a.getText() != null) {
                this.f14912a.getText().setType(2);
                dkl0 dkl0VarM20557d2 = C4137b.this.m20557d(this.f14912a.getText(), this.f14912a.getWidth(), this.f14912a.getHeight(), this.f14912a.getOriginVideoWidth());
                if (dkl0VarM20557d2 != null) {
                    arrayList.add(dkl0VarM20557d2);
                }
            }
            this.f14913b.onEffectElementComplete(arrayList);
        }
    }

    /* JADX INFO: renamed from: com.immomo.velib.player.b$c */
    public class c implements dkl0.InterfaceC16566a {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ Bitmap f14915a;

        public c(Bitmap bitmap) {
            this.f14915a = bitmap;
        }

        @Override // p153l.dkl0.InterfaceC16566a
        /* JADX INFO: renamed from: a */
        public Bitmap mo20561a() {
            return this.f14915a;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c */
    public List<dkl0> m20556c(VideoEffectModel videoEffectModel, List<Element> list) throws Throwable {
        ArrayList arrayList = new ArrayList();
        for (Element element : list) {
            if (element.getType() == 1) {
                element.useCircle = true;
            }
            dkl0 dkl0VarM20557d = m20557d(element, videoEffectModel.getWidth(), videoEffectModel.getHeight(), videoEffectModel.getOriginVideoWidth());
            if (dkl0VarM20557d != null) {
                arrayList.add(dkl0VarM20557d);
            }
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d */
    public dkl0 m20557d(Element element, int i, int i2, int i3) throws Throwable {
        Bitmap bitmapM131786a;
        if (element.getType() == 1 && !TextUtils.isEmpty(element.getUrl()) && element.getUrl().startsWith("http")) {
            bitmapM131786a = l33.m152668b(element.getUrl());
        } else if (element.getType() == 2) {
            if (this.f14906a == null) {
                this.f14906a = new gre();
            }
            int fontPixel = element.getFontPixel();
            gre greVar = this.f14906a;
            bitmapM131786a = fontPixel == 0 ? greVar.m131786a(element) : greVar.m131787b(element, i, i2, i3);
        } else {
            bitmapM131786a = null;
        }
        if (element.getType() == 1 && bitmapM131786a == null && this.f14907b && !TextUtils.isEmpty(this.f14908c)) {
            bitmapM131786a = l33.m152668b(this.f14908c);
        }
        if (bitmapM131786a == null || bitmapM131786a.isRecycled()) {
            return null;
        }
        dkl0 dkl0Var = new dkl0();
        dkl0Var.f89411a = element;
        dkl0Var.m116670g("avatar");
        dkl0Var.m116667d(Constants.PN_IMAGE_DOWNLOAD_TIMEOUT_IN_MILLIS);
        dkl0Var.m116671h(bitmapM131786a.getWidth());
        dkl0Var.m116668e(bitmapM131786a.getHeight());
        dkl0Var.m116669f(new c(bitmapM131786a));
        return dkl0Var;
    }

    /* JADX INFO: renamed from: e */
    private void m20558e(VideoEffectModel videoEffectModel, dam damVar) {
        nre.m164481a(new a(videoEffectModel, damVar));
    }

    /* JADX INFO: renamed from: f */
    private void m20559f(VideoEffectModel videoEffectModel, dam damVar) {
        nre.m164481a(new b(videoEffectModel, damVar));
    }

    /* JADX INFO: renamed from: g */
    public boolean m20560g(C4136a c4136a, @NonNull dam damVar) {
        VideoEffectModel videoEffectModel;
        if (c4136a == null || (videoEffectModel = c4136a.f14883e) == null) {
            damVar.onEffectElementComplete(new ArrayList());
            return true;
        }
        this.f14907b = c4136a.f14885g;
        this.f14908c = c4136a.f14886h;
        List<Element> elements = videoEffectModel.getElements();
        VideoEffectModel videoEffectModel2 = c4136a.f14883e;
        if (elements != null) {
            m20558e(videoEffectModel2, damVar);
            return false;
        }
        m20559f(videoEffectModel2, damVar);
        return false;
    }
}
