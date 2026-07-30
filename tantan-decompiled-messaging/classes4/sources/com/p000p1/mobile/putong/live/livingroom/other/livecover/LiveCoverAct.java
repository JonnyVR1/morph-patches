package com.p000p1.mobile.putong.live.livingroom.other.livecover;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.Nullable;
import com.p000p1.mobile.putong.live.livingroom.archi.act.LivingBaseAct;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.data.Media;
import com.p1.mobile.putong.data.Picture;
import com.p1.mobile.putong.live.base.webview.LiveWebViewAct;
import java.util.List;
import l.ddv;
import l.hxs;
import l.s7m;
import l.t100;
import l.vwb;
import l.xdl0;
import p002l.j5s;
import p002l.v5s;
import v.VButton;
import v.VDraweeView;
import v.VImage;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class LiveCoverAct extends LivingBaseAct implements s7m<v5s> {

    /* JADX INFO: renamed from: c */
    public VDraweeView f7236c;

    /* JADX INFO: renamed from: d */
    public VImage f7237d;

    /* JADX INFO: renamed from: e */
    public VDraweeView f7238e;

    /* JADX INFO: renamed from: f */
    public VButton f7239f;

    /* JADX INFO: renamed from: g */
    public VText f7240g;

    /* JADX INFO: renamed from: h */
    public VText f7241h;

    /* JADX INFO: renamed from: i */
    public VText f7242i;

    /* JADX INFO: renamed from: j */
    public VButton f7243j;

    /* JADX INFO: renamed from: k */
    public v5s f7244k;

    /* JADX INFO: renamed from: l */
    public Picture f7245l;

    /* JADX INFO: renamed from: b2 */
    public static Intent m9099b2(Context context, String str, String str2) {
        Intent intent = new Intent(context, (Class<?>) LiveCoverAct.class);
        intent.putExtra("old_room_info_tag", str);
        intent.putExtra("from_tag", str2);
        return intent;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e2 */
    public /* synthetic */ void m9100e2(View view) {
        act().pickImagesWithPicker(1, false, false, true, "from_change_anchor_cover");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g2 */
    public /* synthetic */ void m9101g2(View view) {
        finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h2 */
    public /* synthetic */ void m9102h2(View view) {
        this.f7244k.m23768D0(view);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: i2 */
    public /* synthetic */ void m9103i2(View view) {
        startActivity(LiveWebViewAct.c2(this, ddv.c));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: A3 */
    public void m9104A3(String str) {
        setTransparentStatusBar();
        xdl0.X(this.f7237d, xdl0.F0() + t100.h);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f7238e.getLayoutParams();
        int iY0 = xdl0.y0() - t100.d(32.0f);
        layoutParams.width = iY0;
        layoutParams.height = iY0;
        this.f7238e.setLayoutParams(layoutParams);
        xdl0.E0(this.f7239f, new View.OnClickListener() { // from class: l.f5s
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f10131a.m9100e2(view);
            }
        });
        xdl0.E0(this.f7237d, new View.OnClickListener() { // from class: l.g5s
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f11272a.m9101g2(view);
            }
        });
        xdl0.E0(this.f7243j, new View.OnClickListener() { // from class: l.h5s
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f11886a.m9102h2(view);
            }
        });
        boolean zEquals = TextUtils.equals(str, "from_voice");
        VText vText = this.f7242i;
        if (zEquals) {
            xdl0.M(vText, false);
        } else {
            xdl0.E0(vText, new View.OnClickListener() { // from class: l.i5s
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f13057a.m9103i2(view);
                }
            });
        }
        Picture picture = this.f7245l;
        if (picture != null) {
            m9110k2(false, ((Media) picture).url);
        }
        if (TextUtils.equals(getIntent().getStringExtra("from_tag"), "from_voice")) {
            this.f7240g.setText("语音房封面");
            this.f7241h.setText("封面为人工审核，请勿上传暴露/模糊的照片，封面如在审核中/被驳回，会保持原封面不变");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context m9105C0() {
        return this;
    }

    /* JADX INFO: renamed from: a2 */
    public View m9106a2(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return j5s.m15666b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: c2, reason: merged with bridge method [inline-methods] */
    public void m9109i1(v5s v5sVar) {
        this.f7244k = v5sVar;
    }

    /* JADX INFO: renamed from: d2 */
    public Picture m9108d2() {
        return this.f7245l;
    }

    public void destroy() {
    }

    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return m9106a2(layoutInflater, viewGroup);
    }

    public void initDataOnCreate() {
        super.initDataOnCreate();
        Act act = ((Act) this).act;
        new v5s(act, act).C(this);
    }

    public void initSubscription() {
        super.initSubscription();
        this.f7244k.m23770a0();
    }

    /* JADX INFO: renamed from: k2 */
    public void m9110k2(boolean z, String str) {
        int iD = t100.d(20.0f);
        hxs.s("context_livingAct", this.f7238e, str);
        VDraweeView vDraweeView = this.f7236c;
        if (z) {
            hxs.p("context_livingAct", vDraweeView, str, 1, iD);
        } else {
            hxs.q(vDraweeView, str, 1, iD);
            this.f7243j.setEnabled(true);
        }
    }

    public void onPickImagesResult(List<Media> list) {
        if (vwb.J(list)) {
            return;
        }
        this.f7245l = list.get(0);
        this.f7243j.setEnabled(true);
        m9110k2(false, ((Media) this.f7245l).url);
    }

    public void onRestoreGlobalState(Bundle bundle) {
        super.onRestoreGlobalState(bundle);
        this.f7245l = bundle.getSerializable("changed_picture");
    }

    public void onSaveGlobalState(Bundle bundle) {
        super.onSaveGlobalState(bundle);
        Picture picture = this.f7245l;
        if (picture != null) {
            bundle.putSerializable("changed_picture", picture);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void preCreateView(Bundle bundle) {
        super.preCreateView(bundle);
        this.f7244k.m23767C0(getIntent().getStringExtra("old_room_info_tag"), getIntent().getStringExtra("from_tag"));
    }
}
