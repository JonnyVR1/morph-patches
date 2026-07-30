package p151v;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.text.TextUtils;
import android.util.AttributeSet;
import com.facebook.imagepipeline.request.ImageRequest;
import com.facebook.imagepipeline.request.ImageRequestBuilder;
import com.immomo.momomediaext.sei.BaseSei;
import com.tantanapp.common.utils.NullChecker;
import p153l.am2;
import p153l.f9j;
import p153l.fm80;
import p153l.pf60;
import p153l.phm;
import p153l.q3d0;
import p153l.tkm;
import p153l.wim;
import p153l.wlj;

/* JADX INFO: loaded from: classes3.dex */
public class AutoVDraweeView extends VDraweeView {

    /* JADX INFO: renamed from: o */
    public Uri f209860o;

    /* JADX INFO: renamed from: p */
    public Object f209861p;

    /* JADX INFO: renamed from: q */
    public int f209862q;

    /* JADX INFO: renamed from: r */
    public int f209863r;

    /* JADX INFO: renamed from: s */
    public String f209864s;

    /* JADX INFO: renamed from: t */
    public long f209865t;

    /* JADX INFO: renamed from: u */
    public boolean f209866u;

    /* JADX INFO: renamed from: v */
    public boolean f209867v;

    /* JADX INFO: renamed from: w */
    public boolean f209868w;

    /* JADX INFO: renamed from: x */
    public boolean f209869x;

    /* JADX INFO: renamed from: y */
    public boolean f209870y;

    /* JADX INFO: renamed from: z */
    public fm80 f209871z;

    public AutoVDraweeView(Context context, wlj wljVar) {
        super(context, wljVar);
        this.f209862q = -1;
        this.f209863r = -1;
    }

    @Override // com.facebook.drawee.view.SimpleDraweeView
    /* JADX INFO: renamed from: o */
    public void mo8344o(Uri uri, Object obj) {
        int i;
        this.f209860o = uri;
        this.f209861p = obj;
        this.f209871z = null;
        int i2 = this.f209862q;
        if (i2 <= 0 || (i = this.f209863r) <= 0) {
            return;
        }
        m224132w(i2, i);
    }

    @Override // p151v.VDraweeView, android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (i == this.f209862q && i2 == this.f209863r) {
            return;
        }
        this.f209862q = i;
        this.f209863r = i2;
        if (i <= 0 || i2 <= 0 || this.f209860o == null) {
            return;
        }
        m224132w(i, i2);
    }

    @Override // android.view.View
    public void onWindowFocusChanged(boolean z) {
        int i;
        super.onWindowFocusChanged(z);
        if (z) {
            this.f209862q = getWidth();
            int height = getHeight();
            this.f209863r = height;
            if (this.f209860o == null || (i = this.f209862q) <= 0 || height <= 0) {
                return;
            }
            m224132w(i, height);
        }
    }

    public void setImageUrl(String str) {
        m224134y(str, null);
    }

    /* JADX INFO: renamed from: u */
    public void m224130u() {
        setController(null);
        this.f209860o = null;
        this.f209864s = null;
        this.f209862q = 0;
        this.f209863r = 0;
        this.f209871z = null;
    }

    /* JADX INFO: renamed from: v */
    public final String m224131v(Uri uri, pf60<Boolean, Integer> pf60Var) {
        String string = uri.toString();
        if (string.contains("format")) {
            return string;
        }
        if (!this.f209868w && !string.contains(".png")) {
            if (this.f209866u) {
                if (!string.contains(".jpg")) {
                    string = string.replace(".webp", "") + ".jpg";
                }
            } else if (!string.contains(".webp")) {
                string = string.replace(".jpg", "") + ".webp";
            }
        }
        if (pf60Var.f152157b.intValue() == 0) {
            return string;
        }
        if (!pf60Var.f152156a.booleanValue()) {
            return string + "?format=max_" + pf60Var.f152157b + "xX";
        }
        return string + "?format=" + pf60Var.f152157b + BaseSei.f14624X + pf60Var.f152157b;
    }

    /* JADX INFO: renamed from: w */
    public final void m224132w(int i, int i2) {
        hashCode();
        q3d0 q3d0Var = new q3d0(i, i2);
        pf60<Boolean, Integer> pf60VarM206591a = wim.m206591a(null, q3d0Var);
        String strM224131v = m224131v(this.f209860o, pf60VarM206591a);
        if (this.f209870y || !TextUtils.equals(strM224131v, this.f209864s)) {
            this.f209864s = strM224131v;
            this.f209865t++;
            ImageRequestBuilder imageRequestBuilderM8648B = ImageRequestBuilder.m8646y(Uri.parse(strM224131v)).m8661O(q3d0Var).m8648B(pf60VarM206591a.f152157b.intValue() <= 180 ? ImageRequest.CacheChoice.SMALL : ImageRequest.CacheChoice.DEFAULT);
            if (NullChecker.m82486a(this.f209871z)) {
                imageRequestBuilderM8648B.m8657K(this.f209871z);
            } else if (!this.f209867v) {
                imageRequestBuilderM8648B.m8653G(phm.m172329b().m176610p(Bitmap.Config.RGB_565).m176595a());
            }
            setController(f9j.m124665g().m8257A(this.f209861p).mo8264b(getController()).m8259C(imageRequestBuilderM8648B.m8668a()).m8258B(new am2.C15744b(tkm.m191581b("autoVDraweeView", strM224131v, this, null, i, i2))).m8287z(this.f209869x).build());
        }
    }

    /* JADX INFO: renamed from: x */
    public void m224133x(String str, int i) {
        int i2;
        this.f209860o = Uri.parse(str);
        this.f209866u = (i & 4) != 0;
        this.f209867v = (i & 1) != 0;
        this.f209868w = (i & 2) != 0;
        this.f209869x = (i & 8) != 0;
        this.f209870y = (i & 16) != 0;
        this.f209871z = null;
        int i3 = this.f209862q;
        if (i3 <= 0 || (i2 = this.f209863r) <= 0) {
            return;
        }
        m224132w(i3, i2);
    }

    /* JADX INFO: renamed from: y */
    public void m224134y(String str, fm80 fm80Var) {
        int i;
        this.f209860o = Uri.parse(str);
        this.f209866u = false;
        this.f209867v = false;
        this.f209868w = false;
        this.f209869x = false;
        this.f209870y = true;
        this.f209871z = fm80Var;
        int i2 = this.f209862q;
        if (i2 <= 0 || (i = this.f209863r) <= 0) {
            return;
        }
        m224132w(i2, i);
    }

    public AutoVDraweeView(Context context) {
        super(context);
        this.f209862q = -1;
        this.f209863r = -1;
    }

    public AutoVDraweeView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f209862q = -1;
        this.f209863r = -1;
    }

    public AutoVDraweeView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f209862q = -1;
        this.f209863r = -1;
    }

    public AutoVDraweeView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.f209862q = -1;
        this.f209863r = -1;
    }
}
