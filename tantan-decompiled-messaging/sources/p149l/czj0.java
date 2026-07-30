package p149l;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.Nullable;
import com.p046p1.mobile.putong.live.base.data.BLiveUserCardButtonConfig;
import com.p046p1.mobile.putong.p065ui.download.DownloadTask;
import com.tantanapp.common.utils.CrashHelper;
import java.io.File;
import p147v.VText;

/* JADX INFO: loaded from: classes4.dex */
public class czj0 implements s7m<dzj0> {

    /* JADX INFO: renamed from: a */
    public dzj0 f83091a;

    /* JADX INFO: renamed from: b */
    public final VText f83092b;

    /* JADX INFO: renamed from: c */
    public DownloadTask f83093c;

    /* JADX INFO: renamed from: d */
    public Bitmap f83094d;

    public czj0(VText vText) {
        this.f83092b = vText;
    }

    @Override // p149l.s7m
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return this.f83092b.getContext();
    }

    @Override // p149l.s7m
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public void mo21065i1(dzj0 dzj0Var) {
        this.f83091a = dzj0Var;
    }

    /* JADX INFO: renamed from: d */
    public void m109416d() {
        this.f83092b.setBackground(getContext().getDrawable(i3c0.f110838R));
        xdl0.m208344M(this.f83092b, false);
        bk40.m102265e(this.f83094d, this.f83093c);
    }

    /* JADX INFO: renamed from: e */
    public void m109417e(String str) {
        File fileM102264d = bk40.m102264d(getContext(), str);
        if (fileM102264d.exists()) {
            m109420j(fileM102264d);
        } else {
            this.f83093c = bk40.m102266f(str, fileM102264d, new e30() { // from class: l.azj0
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f72359a.m109420j((File) obj);
                }
            }, null);
        }
    }

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ void m109418f(File file) {
        this.f83094d = bk40.m102268h(this.f83092b, file);
    }

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ void m109419i(BLiveUserCardButtonConfig bLiveUserCardButtonConfig, View view) {
        this.f83091a.m114125k4(bLiveUserCardButtonConfig);
    }

    @Override // p149l.s7m
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return null;
    }

    /* JADX INFO: renamed from: j */
    public void m109420j(final File file) {
        xdl0.m208344M(this.f83092b, true);
        e51.m114742G(new Runnable() { // from class: l.bzj0
            @Override // java.lang.Runnable
            public final void run() {
                this.f78040a.m109418f(file);
            }
        });
    }

    /* JADX INFO: renamed from: k */
    public void m109421k(final BLiveUserCardButtonConfig bLiveUserCardButtonConfig) {
        if (bLiveUserCardButtonConfig == null) {
            return;
        }
        xdl0.m208329E0(this.f83092b, new View.OnClickListener() { // from class: l.zyj0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f205692a.m109419i(bLiveUserCardButtonConfig, view);
            }
        });
        this.f83092b.setText(bLiveUserCardButtonConfig.contentConfig.text);
        if (!TextUtils.isEmpty(bLiveUserCardButtonConfig.contentConfig.color)) {
            try {
                this.f83092b.setTextColor(Color.parseColor(bLiveUserCardButtonConfig.contentConfig.color));
            } catch (IllegalArgumentException e) {
                CrashHelper.m81296c(e);
            }
        }
        if (!TextUtils.isEmpty(bLiveUserCardButtonConfig.pictureConfig.staticUrl)) {
            m109417e(bLiveUserCardButtonConfig.pictureConfig.staticUrl);
            return;
        }
        Drawable drawableM152651a = m25.m152651a(this.f83091a.m114124j4(bLiveUserCardButtonConfig), this.f83092b, t100.m186890d(11.0f));
        xdl0.m208344M(this.f83092b, true);
        this.f83092b.setBackground(drawableM152651a);
    }

    @Override // p149l.s7m
    public void destroy() {
    }
}
