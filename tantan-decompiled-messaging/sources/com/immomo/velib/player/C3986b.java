package com.immomo.velib.player;

import android.graphics.Bitmap;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.clevertap.android.sdk.Constants;
import com.immomo.velib.anim.model.Element;
import com.immomo.velib.anim.model.VideoEffectModel;
import java.util.ArrayList;
import java.util.List;
import p149l.cqe;
import p149l.jqe;
import p149l.n7m;
import p149l.v23;
import p149l.zal0;

/* JADX INFO: renamed from: com.immomo.velib.player.b */
/* JADX INFO: loaded from: classes7.dex */
public class C3986b {

    /* JADX INFO: renamed from: a */
    private cqe f14187a;

    /* JADX INFO: renamed from: b */
    private boolean f14188b = false;

    /* JADX INFO: renamed from: c */
    private String f14189c = "";

    /* JADX INFO: renamed from: com.immomo.velib.player.b$a */
    public class a implements Runnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ VideoEffectModel f14190a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ n7m f14191b;

        public a(VideoEffectModel videoEffectModel, n7m n7mVar) {
            this.f14190a = videoEffectModel;
            this.f14191b = n7mVar;
        }

        @Override // java.lang.Runnable
        public void run() throws Throwable {
            List<Element> elements = this.f14190a.getElements();
            List<zal0> arrayList = new ArrayList<>(16);
            if (elements != null && !elements.isEmpty()) {
                arrayList = C3986b.this.m19557c(this.f14190a, elements);
            }
            this.f14191b.onEffectElementComplete(arrayList);
        }
    }

    /* JADX INFO: renamed from: com.immomo.velib.player.b$b */
    public class b implements Runnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ VideoEffectModel f14193a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ n7m f14194b;

        public b(VideoEffectModel videoEffectModel, n7m n7mVar) {
            this.f14193a = videoEffectModel;
            this.f14194b = n7mVar;
        }

        @Override // java.lang.Runnable
        public void run() throws Throwable {
            ArrayList arrayList = new ArrayList(16);
            if (this.f14193a.getAvatar() != null) {
                this.f14193a.getAvatar().setType(1);
                this.f14193a.getAvatar().useCircle = true;
                zal0 zal0VarM19558d = C3986b.this.m19558d(this.f14193a.getAvatar(), this.f14193a.getWidth(), this.f14193a.getHeight(), this.f14193a.getOriginVideoWidth());
                if (zal0VarM19558d != null) {
                    arrayList.add(zal0VarM19558d);
                }
            }
            if (this.f14193a.getText() != null) {
                this.f14193a.getText().setType(2);
                zal0 zal0VarM19558d2 = C3986b.this.m19558d(this.f14193a.getText(), this.f14193a.getWidth(), this.f14193a.getHeight(), this.f14193a.getOriginVideoWidth());
                if (zal0VarM19558d2 != null) {
                    arrayList.add(zal0VarM19558d2);
                }
            }
            this.f14194b.onEffectElementComplete(arrayList);
        }
    }

    /* JADX INFO: renamed from: com.immomo.velib.player.b$c */
    public class c implements zal0.InterfaceC21652a {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ Bitmap f14196a;

        public c(Bitmap bitmap) {
            this.f14196a = bitmap;
        }

        @Override // p149l.zal0.InterfaceC21652a
        /* JADX INFO: renamed from: a */
        public Bitmap mo19562a() {
            return this.f14196a;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c */
    public List<zal0> m19557c(VideoEffectModel videoEffectModel, List<Element> list) throws Throwable {
        ArrayList arrayList = new ArrayList();
        for (Element element : list) {
            if (element.getType() == 1) {
                element.useCircle = true;
            }
            zal0 zal0VarM19558d = m19558d(element, videoEffectModel.getWidth(), videoEffectModel.getHeight(), videoEffectModel.getOriginVideoWidth());
            if (zal0VarM19558d != null) {
                arrayList.add(zal0VarM19558d);
            }
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d */
    public zal0 m19558d(Element element, int i, int i2, int i3) throws Throwable {
        Bitmap bitmapM108254a;
        if (element.getType() == 1 && !TextUtils.isEmpty(element.getUrl()) && element.getUrl().startsWith("http")) {
            bitmapM108254a = v23.m196706b(element.getUrl());
        } else if (element.getType() == 2) {
            if (this.f14187a == null) {
                this.f14187a = new cqe();
            }
            int fontPixel = element.getFontPixel();
            cqe cqeVar = this.f14187a;
            bitmapM108254a = fontPixel == 0 ? cqeVar.m108254a(element) : cqeVar.m108255b(element, i, i2, i3);
        } else {
            bitmapM108254a = null;
        }
        if (element.getType() == 1 && bitmapM108254a == null && this.f14188b && !TextUtils.isEmpty(this.f14189c)) {
            bitmapM108254a = v23.m196706b(this.f14189c);
        }
        if (bitmapM108254a == null || bitmapM108254a.isRecycled()) {
            return null;
        }
        zal0 zal0Var = new zal0();
        zal0Var.f202371a = element;
        zal0Var.m217740g("avatar");
        zal0Var.m217737d(Constants.PN_IMAGE_DOWNLOAD_TIMEOUT_IN_MILLIS);
        zal0Var.m217741h(bitmapM108254a.getWidth());
        zal0Var.m217738e(bitmapM108254a.getHeight());
        zal0Var.m217739f(new c(bitmapM108254a));
        return zal0Var;
    }

    /* JADX INFO: renamed from: e */
    private void m19559e(VideoEffectModel videoEffectModel, n7m n7mVar) {
        jqe.m142789a(new a(videoEffectModel, n7mVar));
    }

    /* JADX INFO: renamed from: f */
    private void m19560f(VideoEffectModel videoEffectModel, n7m n7mVar) {
        jqe.m142789a(new b(videoEffectModel, n7mVar));
    }

    /* JADX INFO: renamed from: g */
    public boolean m19561g(C3985a c3985a, @NonNull n7m n7mVar) {
        VideoEffectModel videoEffectModel;
        if (c3985a == null || (videoEffectModel = c3985a.f14164e) == null) {
            n7mVar.onEffectElementComplete(new ArrayList());
            return true;
        }
        this.f14188b = c3985a.f14166g;
        this.f14189c = c3985a.f14167h;
        List<Element> elements = videoEffectModel.getElements();
        VideoEffectModel videoEffectModel2 = c3985a.f14164e;
        if (elements != null) {
            m19559e(videoEffectModel2, n7mVar);
            return false;
        }
        m19560f(videoEffectModel2, n7mVar);
        return false;
    }
}
