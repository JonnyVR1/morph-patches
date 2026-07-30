package p147v;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.text.TextUtils;
import android.util.AttributeSet;
import com.facebook.imagepipeline.request.ImageRequest;
import com.facebook.imagepipeline.request.ImageRequestBuilder;
import com.immomo.momomediaext.sei.BaseSei;
import com.tantanapp.common.utils.NullChecker;
import p149l.djj;
import p149l.j760;
import p149l.l6j;
import p149l.nvc0;
import p149l.qim;
import p149l.sl2;
import p149l.tgm;
import p149l.yd80;
import p149l.zem;

/* JADX INFO: loaded from: classes3.dex */
public class AutoVDraweeView extends VDraweeView {

    /* JADX INFO: renamed from: o */
    public Uri f208938o;

    /* JADX INFO: renamed from: p */
    public Object f208939p;

    /* JADX INFO: renamed from: q */
    public int f208940q;

    /* JADX INFO: renamed from: r */
    public int f208941r;

    /* JADX INFO: renamed from: s */
    public String f208942s;

    /* JADX INFO: renamed from: t */
    public long f208943t;

    /* JADX INFO: renamed from: u */
    public boolean f208944u;

    /* JADX INFO: renamed from: v */
    public boolean f208945v;

    /* JADX INFO: renamed from: w */
    public boolean f208946w;

    /* JADX INFO: renamed from: x */
    public boolean f208947x;

    /* JADX INFO: renamed from: y */
    public boolean f208948y;

    /* JADX INFO: renamed from: z */
    public yd80 f208949z;

    public AutoVDraweeView(Context context, djj djjVar) {
        super(context, djjVar);
        this.f208940q = -1;
        this.f208941r = -1;
    }

    @Override // com.facebook.drawee.view.SimpleDraweeView
    /* JADX INFO: renamed from: o */
    public void mo8290o(Uri uri, Object obj) {
        int i;
        this.f208938o = uri;
        this.f208939p = obj;
        this.f208949z = null;
        int i2 = this.f208940q;
        if (i2 <= 0 || (i = this.f208941r) <= 0) {
            return;
        }
        m222886w(i2, i);
    }

    @Override // p147v.VDraweeView, android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (i == this.f208940q && i2 == this.f208941r) {
            return;
        }
        this.f208940q = i;
        this.f208941r = i2;
        if (i <= 0 || i2 <= 0 || this.f208938o == null) {
            return;
        }
        m222886w(i, i2);
    }

    @Override // android.view.View
    public void onWindowFocusChanged(boolean z) {
        int i;
        super.onWindowFocusChanged(z);
        if (z) {
            this.f208940q = getWidth();
            int height = getHeight();
            this.f208941r = height;
            if (this.f208938o == null || (i = this.f208940q) <= 0 || height <= 0) {
                return;
            }
            m222886w(i, height);
        }
    }

    public void setImageUrl(String str) {
        m222888y(str, null);
    }

    /* JADX INFO: renamed from: u */
    public void m222884u() {
        setController(null);
        this.f208938o = null;
        this.f208942s = null;
        this.f208940q = 0;
        this.f208941r = 0;
        this.f208949z = null;
    }

    /* JADX INFO: renamed from: v */
    public final String m222885v(Uri uri, j760<Boolean, Integer> j760Var) {
        String string = uri.toString();
        if (string.contains("format")) {
            return string;
        }
        if (!this.f208946w && !string.contains(".png")) {
            if (this.f208944u) {
                if (!string.contains(".jpg")) {
                    string = string.replace(".webp", "") + ".jpg";
                }
            } else if (!string.contains(".webp")) {
                string = string.replace(".jpg", "") + ".webp";
            }
        }
        if (j760Var.f116565b.intValue() == 0) {
            return string;
        }
        if (!j760Var.f116564a.booleanValue()) {
            return string + "?format=max_" + j760Var.f116565b + "xX";
        }
        return string + "?format=" + j760Var.f116565b + BaseSei.f13930X + j760Var.f116565b;
    }

    /* JADX INFO: renamed from: w */
    public final void m222886w(int i, int i2) {
        hashCode();
        nvc0 nvc0Var = new nvc0(i, i2);
        j760<Boolean, Integer> j760VarM188819a = tgm.m188819a(null, nvc0Var);
        String strM222885v = m222885v(this.f208938o, j760VarM188819a);
        if (this.f208948y || !TextUtils.equals(strM222885v, this.f208942s)) {
            this.f208942s = strM222885v;
            this.f208943t++;
            ImageRequestBuilder imageRequestBuilderM8594B = ImageRequestBuilder.m8592y(Uri.parse(strM222885v)).m8607O(nvc0Var).m8594B(j760VarM188819a.f116565b.intValue() <= 180 ? ImageRequest.CacheChoice.SMALL : ImageRequest.CacheChoice.DEFAULT);
            if (NullChecker.m81303a(this.f208949z)) {
                imageRequestBuilderM8594B.m8603K(this.f208949z);
            } else if (!this.f208945v) {
                imageRequestBuilderM8594B.m8599G(zem.m218356b().m96257p(Bitmap.Config.RGB_565).m96242a());
            }
            setController(l6j.m148750g().m8203A(this.f208939p).mo8210b(getController()).m8205C(imageRequestBuilderM8594B.m8614a()).m8204B(new sl2.C19981b(qim.m174901b("autoVDraweeView", strM222885v, this, null, i, i2))).m8233z(this.f208947x).build());
        }
    }

    /* JADX INFO: renamed from: x */
    public void m222887x(String str, int i) {
        int i2;
        this.f208938o = Uri.parse(str);
        this.f208944u = (i & 4) != 0;
        this.f208945v = (i & 1) != 0;
        this.f208946w = (i & 2) != 0;
        this.f208947x = (i & 8) != 0;
        this.f208948y = (i & 16) != 0;
        this.f208949z = null;
        int i3 = this.f208940q;
        if (i3 <= 0 || (i2 = this.f208941r) <= 0) {
            return;
        }
        m222886w(i3, i2);
    }

    /* JADX INFO: renamed from: y */
    public void m222888y(String str, yd80 yd80Var) {
        int i;
        this.f208938o = Uri.parse(str);
        this.f208944u = false;
        this.f208945v = false;
        this.f208946w = false;
        this.f208947x = false;
        this.f208948y = true;
        this.f208949z = yd80Var;
        int i2 = this.f208940q;
        if (i2 <= 0 || (i = this.f208941r) <= 0) {
            return;
        }
        m222886w(i2, i);
    }

    public AutoVDraweeView(Context context) {
        super(context);
        this.f208940q = -1;
        this.f208941r = -1;
    }

    public AutoVDraweeView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f208940q = -1;
        this.f208941r = -1;
    }

    public AutoVDraweeView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f208940q = -1;
        this.f208941r = -1;
    }

    public AutoVDraweeView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.f208940q = -1;
        this.f208941r = -1;
    }
}
