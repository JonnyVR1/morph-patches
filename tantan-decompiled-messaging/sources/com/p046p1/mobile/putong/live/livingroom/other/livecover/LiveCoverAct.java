package com.p046p1.mobile.putong.live.livingroom.other.livecover;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.Nullable;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.app.PutongAct;
import com.p046p1.mobile.putong.data.Media;
import com.p046p1.mobile.putong.data.Picture;
import com.p046p1.mobile.putong.live.base.webview.LiveWebViewAct;
import com.p046p1.mobile.putong.live.livingroom.archi.act.LivingBaseAct;
import java.util.List;
import p147v.VButton;
import p147v.VDraweeView;
import p147v.VImage;
import p147v.VText;
import p149l.ddv;
import p149l.hxs;
import p149l.j5s;
import p149l.s7m;
import p149l.t100;
import p149l.v5s;
import p149l.vwb;
import p149l.xdl0;

/* JADX INFO: loaded from: classes4.dex */
public class LiveCoverAct extends LivingBaseAct implements s7m<v5s> {

    /* JADX INFO: renamed from: c */
    public VDraweeView f51194c;

    /* JADX INFO: renamed from: d */
    public VImage f51195d;

    /* JADX INFO: renamed from: e */
    public VDraweeView f51196e;

    /* JADX INFO: renamed from: f */
    public VButton f51197f;

    /* JADX INFO: renamed from: g */
    public VText f51198g;

    /* JADX INFO: renamed from: h */
    public VText f51199h;

    /* JADX INFO: renamed from: i */
    public VText f51200i;

    /* JADX INFO: renamed from: j */
    public VButton f51201j;

    /* JADX INFO: renamed from: k */
    public v5s f51202k;

    /* JADX INFO: renamed from: l */
    public Picture f51203l;

    /* JADX INFO: renamed from: b2 */
    public static Intent m75466b2(Context context, String str, String str2) {
        Intent intent = new Intent(context, (Class<?>) LiveCoverAct.class);
        intent.putExtra("old_room_info_tag", str);
        intent.putExtra("from_tag", str2);
        return intent;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e2 */
    public /* synthetic */ void m75467e2(View view) {
        ((PutongAct) act()).pickImagesWithPicker(1, false, false, true, "from_change_anchor_cover");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g2 */
    public /* synthetic */ void m75468g2(View view) {
        m44477e2();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h2 */
    public /* synthetic */ void m75469h2(View view) {
        this.f51202k.m197168D0(view);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i2 */
    public /* synthetic */ void m75470i2(View view) {
        startActivity(LiveWebViewAct.m68883c2(this, ddv.f85653c));
    }

    /* JADX INFO: renamed from: A3 */
    public void m75471A3(String str) {
        setTransparentStatusBar();
        xdl0.m208360X(this.f51195d, xdl0.m208331F0() + t100.f167259h);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f51196e.getLayoutParams();
        int iM208412y0 = xdl0.m208412y0() - t100.m186890d(32.0f);
        layoutParams.width = iM208412y0;
        layoutParams.height = iM208412y0;
        this.f51196e.setLayoutParams(layoutParams);
        xdl0.m208329E0(this.f51197f, new View.OnClickListener() { // from class: l.f5s
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f95200a.m75467e2(view);
            }
        });
        xdl0.m208329E0(this.f51195d, new View.OnClickListener() { // from class: l.g5s
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f101190a.m75468g2(view);
            }
        });
        xdl0.m208329E0(this.f51201j, new View.OnClickListener() { // from class: l.h5s
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f105978a.m75469h2(view);
            }
        });
        boolean zEquals = TextUtils.equals(str, "from_voice");
        VText vText = this.f51200i;
        if (zEquals) {
            xdl0.m208344M(vText, false);
        } else {
            xdl0.m208329E0(vText, new View.OnClickListener() { // from class: l.i5s
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f111633a.m75470i2(view);
                }
            });
        }
        Picture picture = this.f51203l;
        if (picture != null) {
            m75475k2(false, picture.url);
        }
        if (TextUtils.equals(getIntent().getStringExtra("from_tag"), "from_voice")) {
            this.f51198g.setText("语音房封面");
            this.f51199h.setText("封面为人工审核，请勿上传暴露/模糊的照片，封面如在审核中/被驳回，会保持原封面不变");
        }
    }

    @Override // p149l.s7m
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return this;
    }

    /* JADX INFO: renamed from: a2 */
    public View m75472a2(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return j5s.m139870b(this, layoutInflater, viewGroup);
    }

    @Override // p149l.s7m
    /* JADX INFO: renamed from: c2, reason: merged with bridge method [inline-methods] */
    public void mo21065i1(v5s v5sVar) {
        this.f51202k = v5sVar;
    }

    /* JADX INFO: renamed from: d2 */
    public Picture m75474d2() {
        return this.f51203l;
    }

    @Override // p149l.s7m
    public void destroy() {
    }

    @Override // com.p046p1.mobile.android.app.Act
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return m75472a2(layoutInflater, viewGroup);
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act
    public void initDataOnCreate() {
        super.initDataOnCreate();
        Act act = this.act;
        new v5s(act, act).mo51532C(this);
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act
    public void initSubscription() {
        super.initSubscription();
        this.f51202k.mo39470a0();
    }

    /* JADX INFO: renamed from: k2 */
    public void m75475k2(boolean z, String str) {
        int iM186890d = t100.m186890d(20.0f);
        hxs.m133406s("context_livingAct", this.f51196e, str);
        VDraweeView vDraweeView = this.f51194c;
        if (z) {
            hxs.m133403p("context_livingAct", vDraweeView, str, 1, iM186890d);
        } else {
            hxs.m133404q(vDraweeView, str, 1, iM186890d);
            this.f51201j.setEnabled(true);
        }
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct
    public void onPickImagesResult(List<Media> list) {
        if (vwb.m200296J(list)) {
            return;
        }
        this.f51203l = (Picture) list.get(0);
        this.f51201j.setEnabled(true);
        m75475k2(false, this.f51203l.url);
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act
    public void onRestoreGlobalState(Bundle bundle) {
        super.onRestoreGlobalState(bundle);
        this.f51203l = (Picture) bundle.getSerializable("changed_picture");
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act
    public void onSaveGlobalState(Bundle bundle) {
        super.onSaveGlobalState(bundle);
        Picture picture = this.f51203l;
        if (picture != null) {
            bundle.putSerializable("changed_picture", picture);
        }
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act
    public void preCreateView(Bundle bundle) {
        super.preCreateView(bundle);
        this.f51202k.m197167C0(getIntent().getStringExtra("old_room_info_tag"), getIntent().getStringExtra("from_tag"));
    }
}
