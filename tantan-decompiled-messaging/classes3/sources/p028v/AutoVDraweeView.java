package p028v;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.text.TextUtils;
import android.util.AttributeSet;
import com.facebook.imagepipeline.request.ImageRequest;
import com.facebook.imagepipeline.request.ImageRequestBuilder;
import com.tantanapp.common.utils.NullChecker;
import l.djj;
import l.j760;
import l.l6j;
import l.nvc0;
import l.sl2;
import l.yd80;
import l.zem;
import p003l.qim;
import p003l.tgm;
import tv.danmaku.ijk.media.player.IjkMediaMeta;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class AutoVDraweeView extends VDraweeView {

    /* JADX INFO: renamed from: o */
    public Uri f12563o;

    /* JADX INFO: renamed from: p */
    public Object f12564p;

    /* JADX INFO: renamed from: q */
    public int f12565q;

    /* JADX INFO: renamed from: r */
    public int f12566r;

    /* JADX INFO: renamed from: s */
    public String f12567s;

    /* JADX INFO: renamed from: t */
    public long f12568t;

    /* JADX INFO: renamed from: u */
    public boolean f12569u;

    /* JADX INFO: renamed from: v */
    public boolean f12570v;

    /* JADX INFO: renamed from: w */
    public boolean f12571w;

    /* JADX INFO: renamed from: x */
    public boolean f12572x;

    /* JADX INFO: renamed from: y */
    public boolean f12573y;

    /* JADX INFO: renamed from: z */
    public yd80 f12574z;

    public AutoVDraweeView(Context context, djj djjVar) {
        super(context, djjVar);
        this.f12565q = -1;
        this.f12566r = -1;
    }

    /* JADX INFO: renamed from: o */
    public void m11355o(Uri uri, Object obj) {
        int i;
        this.f12563o = uri;
        this.f12564p = obj;
        this.f12574z = null;
        int i2 = this.f12565q;
        if (i2 <= 0 || (i = this.f12566r) <= 0) {
            return;
        }
        m11358w(i2, i);
    }

    @Override // p028v.VDraweeView
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (i == this.f12565q && i2 == this.f12566r) {
            return;
        }
        this.f12565q = i;
        this.f12566r = i2;
        if (i <= 0 || i2 <= 0 || this.f12563o == null) {
            return;
        }
        m11358w(i, i2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onWindowFocusChanged(boolean z) {
        int i;
        super/*android.view.View*/.onWindowFocusChanged(z);
        if (z) {
            this.f12565q = getWidth();
            int height = getHeight();
            this.f12566r = height;
            if (this.f12563o == null || (i = this.f12565q) <= 0 || height <= 0) {
                return;
            }
            m11358w(i, height);
        }
    }

    public void setImageUrl(String str) {
        m11360y(str, null);
    }

    /* JADX INFO: renamed from: u */
    public void m11356u() {
        setController(null);
        this.f12563o = null;
        this.f12567s = null;
        this.f12565q = 0;
        this.f12566r = 0;
        this.f12574z = null;
    }

    /* JADX INFO: renamed from: v */
    public final String m11357v(Uri uri, j760<Boolean, Integer> j760Var) {
        String string = uri.toString();
        if (string.contains(IjkMediaMeta.IJKM_KEY_FORMAT)) {
            return string;
        }
        if (!this.f12571w && !string.contains(".png")) {
            if (this.f12569u) {
                if (!string.contains(".jpg")) {
                    string = string.replace(".webp", "") + ".jpg";
                }
            } else if (!string.contains(".webp")) {
                string = string.replace(".jpg", "") + ".webp";
            }
        }
        if (((Integer) j760Var.b).intValue() == 0) {
            return string;
        }
        if (!((Boolean) j760Var.a).booleanValue()) {
            return string + "?format=max_" + j760Var.b + "xX";
        }
        return string + "?format=" + j760Var.b + "x" + j760Var.b;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: w */
    public final void m11358w(int i, int i2) {
        hashCode();
        nvc0 nvc0Var = new nvc0(i, i2);
        j760<Boolean, Integer> j760VarM7743a = tgm.m7743a(null, nvc0Var);
        String strM11357v = m11357v(this.f12563o, j760VarM7743a);
        if (this.f12573y || !TextUtils.equals(strM11357v, this.f12567s)) {
            this.f12567s = strM11357v;
            this.f12568t++;
            ImageRequestBuilder imageRequestBuilderB = ImageRequestBuilder.y(Uri.parse(strM11357v)).O(nvc0Var).B(((Integer) j760VarM7743a.b).intValue() <= 180 ? ImageRequest.CacheChoice.SMALL : ImageRequest.CacheChoice.DEFAULT);
            if (NullChecker.a(this.f12574z)) {
                imageRequestBuilderB.K(this.f12574z);
            } else if (!this.f12570v) {
                imageRequestBuilderB.G(zem.b().p(Bitmap.Config.RGB_565).a());
            }
            setController(l6j.g().A(this.f12564p).E(getController()).C(imageRequestBuilderB.a()).B(new sl2.b(qim.m7023b("autoVDraweeView", strM11357v, this, null, i, i2))).z(this.f12572x).c());
        }
    }

    /* JADX INFO: renamed from: x */
    public void m11359x(String str, int i) {
        int i2;
        this.f12563o = Uri.parse(str);
        this.f12569u = (i & 4) != 0;
        this.f12570v = (i & 1) != 0;
        this.f12571w = (i & 2) != 0;
        this.f12572x = (i & 8) != 0;
        this.f12573y = (i & 16) != 0;
        this.f12574z = null;
        int i3 = this.f12565q;
        if (i3 <= 0 || (i2 = this.f12566r) <= 0) {
            return;
        }
        m11358w(i3, i2);
    }

    /* JADX INFO: renamed from: y */
    public void m11360y(String str, yd80 yd80Var) {
        int i;
        this.f12563o = Uri.parse(str);
        this.f12569u = false;
        this.f12570v = false;
        this.f12571w = false;
        this.f12572x = false;
        this.f12573y = true;
        this.f12574z = yd80Var;
        int i2 = this.f12565q;
        if (i2 <= 0 || (i = this.f12566r) <= 0) {
            return;
        }
        m11358w(i2, i);
    }

    public AutoVDraweeView(Context context) {
        super(context);
        this.f12565q = -1;
        this.f12566r = -1;
    }

    public AutoVDraweeView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f12565q = -1;
        this.f12566r = -1;
    }

    public AutoVDraweeView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f12565q = -1;
        this.f12566r = -1;
    }

    public AutoVDraweeView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.f12565q = -1;
        this.f12566r = -1;
    }
}
