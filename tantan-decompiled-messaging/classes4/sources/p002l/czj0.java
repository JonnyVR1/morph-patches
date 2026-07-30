package p002l;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.Nullable;
import com.p1.mobile.putong.live.base.data.BLiveUserCardButtonConfig;
import com.p1.mobile.putong.ui.download.DownloadTask;
import com.tantanapp.common.utils.CrashHelper;
import java.io.File;
import l.bk40;
import l.d30;
import l.e30;
import l.e51;
import l.s7m;
import l.t100;
import l.xdl0;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class czj0 implements s7m<dzj0> {

    /* JADX INFO: renamed from: a */
    public dzj0 f8999a;

    /* JADX INFO: renamed from: b */
    public final VText f9000b;

    /* JADX INFO: renamed from: c */
    public DownloadTask f9001c;

    /* JADX INFO: renamed from: d */
    public Bitmap f9002d;

    public czj0(VText vText) {
        this.f9000b = vText;
    }

    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context m11537C0() {
        return this.f9000b.getContext();
    }

    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public void m11543i1(dzj0 dzj0Var) {
        this.f8999a = dzj0Var;
    }

    /* JADX INFO: renamed from: d */
    public void m11539d() {
        this.f9000b.setBackground(m11537C0().getDrawable(i3c0.f12623R));
        xdl0.M(this.f9000b, false);
        bk40.e(this.f9002d, this.f9001c);
    }

    /* JADX INFO: renamed from: e */
    public void m11540e(String str) {
        File fileD = bk40.d(m11537C0(), str);
        if (fileD.exists()) {
            m11544j(fileD);
        } else {
            this.f9001c = bk40.f(str, fileD, new e30() { // from class: l.azj0
                public final void call(Object obj) {
                    this.f7934a.m11544j((File) obj);
                }
            }, (d30) null);
        }
    }

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ void m11541f(File file) {
        this.f9002d = bk40.h(this.f9000b, file);
    }

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ void m11542i(BLiveUserCardButtonConfig bLiveUserCardButtonConfig, View view) {
        this.f8999a.m12092k4(bLiveUserCardButtonConfig);
    }

    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return null;
    }

    /* JADX INFO: renamed from: j */
    public void m11544j(final File file) {
        xdl0.M(this.f9000b, true);
        e51.G(new Runnable() { // from class: l.bzj0
            @Override // java.lang.Runnable
            public final void run() {
                this.f8427a.m11541f(file);
            }
        });
    }

    /* JADX INFO: renamed from: k */
    public void m11545k(final BLiveUserCardButtonConfig bLiveUserCardButtonConfig) {
        if (bLiveUserCardButtonConfig == null) {
            return;
        }
        xdl0.E0(this.f9000b, new View.OnClickListener() { // from class: l.zyj0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f23671a.m11542i(bLiveUserCardButtonConfig, view);
            }
        });
        this.f9000b.setText(bLiveUserCardButtonConfig.contentConfig.text);
        if (!TextUtils.isEmpty(bLiveUserCardButtonConfig.contentConfig.color)) {
            try {
                this.f9000b.setTextColor(Color.parseColor(bLiveUserCardButtonConfig.contentConfig.color));
            } catch (IllegalArgumentException e) {
                CrashHelper.c(e);
            }
        }
        if (!TextUtils.isEmpty(bLiveUserCardButtonConfig.pictureConfig.staticUrl)) {
            m11540e(bLiveUserCardButtonConfig.pictureConfig.staticUrl);
            return;
        }
        Drawable drawableM17669a = m25.m17669a(this.f8999a.m12091j4(bLiveUserCardButtonConfig), this.f9000b, t100.d(11.0f));
        xdl0.M(this.f9000b, true);
        this.f9000b.setBackground(drawableM17669a);
    }

    public void destroy() {
    }
}
