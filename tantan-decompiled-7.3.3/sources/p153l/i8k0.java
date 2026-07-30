package p153l;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.Nullable;
import com.p051p1.mobile.putong.live.base.data.BLiveUserCardButtonConfig;
import com.p051p1.mobile.putong.p070ui.download.DownloadTask;
import com.tantanapp.common.utils.CrashHelper;
import java.io.File;
import p151v.VText;

/* JADX INFO: loaded from: classes4.dex */
public class i8k0 implements iam<j8k0> {

    /* JADX INFO: renamed from: a */
    public j8k0 f113351a;

    /* JADX INFO: renamed from: b */
    public final VText f113352b;

    /* JADX INFO: renamed from: c */
    public DownloadTask f113353c;

    /* JADX INFO: renamed from: d */
    public Bitmap f113354d;

    public i8k0(VText vText) {
        this.f113352b = vText;
    }

    @Override // p153l.iam
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return this.f113352b.getContext();
    }

    @Override // p153l.iam
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public void mo22064i1(j8k0 j8k0Var) {
        this.f113351a = j8k0Var;
    }

    /* JADX INFO: renamed from: d */
    public void m139014d() {
        this.f113352b.setBackground(getContext().getDrawable(obc0.f146166R));
        bnl0.m105524M(this.f113352b, false);
        ps40.m173584e(this.f113354d, this.f113353c);
    }

    /* JADX INFO: renamed from: e */
    public void m139015e(String str) {
        File fileM173583d = ps40.m173583d(getContext(), str);
        if (fileM173583d.exists()) {
            m139018j(fileM173583d);
        } else {
            this.f113353c = ps40.m173585f(str, fileM173583d, new y20() { // from class: l.g8k0
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f102692a.m139018j((File) obj);
                }
            }, null);
        }
    }

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ void m139016f(File file) {
        this.f113354d = ps40.m173587h(this.f113352b, file);
    }

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ void m139017i(BLiveUserCardButtonConfig bLiveUserCardButtonConfig, View view) {
        this.f113351a.m143837k4(bLiveUserCardButtonConfig);
    }

    @Override // p153l.iam
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return null;
    }

    /* JADX INFO: renamed from: j */
    public void m139018j(final File file) {
        bnl0.m105524M(this.f113352b, true);
        l51.m152887G(new Runnable() { // from class: l.h8k0
            @Override // java.lang.Runnable
            public final void run() {
                this.f108247a.m139016f(file);
            }
        });
    }

    /* JADX INFO: renamed from: k */
    public void m139019k(final BLiveUserCardButtonConfig bLiveUserCardButtonConfig) {
        if (bLiveUserCardButtonConfig == null) {
            return;
        }
        bnl0.m105509E0(this.f113352b, new View.OnClickListener() { // from class: l.f8k0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f97745a.m139017i(bLiveUserCardButtonConfig, view);
            }
        });
        this.f113352b.setText(bLiveUserCardButtonConfig.contentConfig.text);
        if (!TextUtils.isEmpty(bLiveUserCardButtonConfig.contentConfig.color)) {
            try {
                this.f113352b.setTextColor(Color.parseColor(bLiveUserCardButtonConfig.contentConfig.color));
            } catch (IllegalArgumentException e) {
                CrashHelper.m82479c(e);
            }
        }
        if (!TextUtils.isEmpty(bLiveUserCardButtonConfig.pictureConfig.staticUrl)) {
            m139015e(bLiveUserCardButtonConfig.pictureConfig.staticUrl);
            return;
        }
        Drawable drawableM152669a = l35.m152669a(this.f113351a.m143836j4(bLiveUserCardButtonConfig), this.f113352b, qa00.m175859d(11.0f));
        bnl0.m105524M(this.f113352b, true);
        this.f113352b.setBackground(drawableM152669a);
    }

    @Override // p153l.iam
    public void destroy() {
    }
}
