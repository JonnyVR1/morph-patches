package com.p051p1.mobile.putong.live.livingroom.other.livecover;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.Nullable;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.app.PutongAct;
import com.p051p1.mobile.putong.data.Media;
import com.p051p1.mobile.putong.data.Picture;
import com.p051p1.mobile.putong.live.base.webview.LiveWebViewAct;
import com.p051p1.mobile.putong.live.livingroom.archi.act.LivingBaseAct;
import java.util.List;
import p151v.VButton;
import p151v.VDraweeView;
import p151v.VImage;
import p151v.VText;
import p153l.bnl0;
import p153l.efv;
import p153l.iam;
import p153l.izs;
import p153l.jyb;
import p153l.k7s;
import p153l.qa00;
import p153l.w7s;

/* JADX INFO: loaded from: classes5.dex */
public class LiveCoverAct extends LivingBaseAct implements iam<w7s> {

    /* JADX INFO: renamed from: c */
    public VDraweeView f52042c;

    /* JADX INFO: renamed from: d */
    public VImage f52043d;

    /* JADX INFO: renamed from: e */
    public VDraweeView f52044e;

    /* JADX INFO: renamed from: f */
    public VButton f52045f;

    /* JADX INFO: renamed from: g */
    public VText f52046g;

    /* JADX INFO: renamed from: h */
    public VText f52047h;

    /* JADX INFO: renamed from: i */
    public VText f52048i;

    /* JADX INFO: renamed from: j */
    public VButton f52049j;

    /* JADX INFO: renamed from: k */
    public w7s f52050k;

    /* JADX INFO: renamed from: l */
    public Picture f52051l;

    /* JADX INFO: renamed from: c2 */
    public static Intent m76649c2(Context context, String str, String str2) {
        Intent intent = new Intent(context, (Class<?>) LiveCoverAct.class);
        intent.putExtra("old_room_info_tag", str);
        intent.putExtra("from_tag", str2);
        return intent;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g2 */
    public /* synthetic */ void m76650g2(View view) {
        ((PutongAct) act()).pickImagesWithPicker(1, false, false, true, "from_change_anchor_cover");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h2 */
    public /* synthetic */ void m76651h2(View view) {
        m45660g2();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i2 */
    public /* synthetic */ void m76652i2(View view) {
        this.f52050k.m205374D0(view);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k2 */
    public /* synthetic */ void m76653k2(View view) {
        startActivity(LiveWebViewAct.m70066d2(this, efv.f93846c));
    }

    /* JADX INFO: renamed from: A3 */
    public void m76654A3(String str) {
        setTransparentStatusBar();
        bnl0.m105540X(this.f52043d, bnl0.m105511F0() + qa00.f156321h);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f52044e.getLayoutParams();
        int iM105592y0 = bnl0.m105592y0() - qa00.m175859d(32.0f);
        layoutParams.width = iM105592y0;
        layoutParams.height = iM105592y0;
        this.f52044e.setLayoutParams(layoutParams);
        bnl0.m105509E0(this.f52045f, new View.OnClickListener() { // from class: l.g7s
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f102620a.m76650g2(view);
            }
        });
        bnl0.m105509E0(this.f52043d, new View.OnClickListener() { // from class: l.h7s
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f108155a.m76651h2(view);
            }
        });
        bnl0.m105509E0(this.f52049j, new View.OnClickListener() { // from class: l.i7s
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f113290a.m76652i2(view);
            }
        });
        boolean zEquals = TextUtils.equals(str, "from_voice");
        VText vText = this.f52048i;
        if (zEquals) {
            bnl0.m105524M(vText, false);
        } else {
            bnl0.m105509E0(vText, new View.OnClickListener() { // from class: l.j7s
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f118713a.m76653k2(view);
                }
            });
        }
        Picture picture = this.f52051l;
        if (picture != null) {
            m76658l2(false, picture.url);
        }
        if (TextUtils.equals(getIntent().getStringExtra("from_tag"), "from_voice")) {
            this.f52046g.setText("语音房封面");
            this.f52047h.setText("封面为人工审核，请勿上传暴露/模糊的照片，封面如在审核中/被驳回，会保持原封面不变");
        }
    }

    @Override // p153l.iam
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return this;
    }

    /* JADX INFO: renamed from: b2 */
    public View m76655b2(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return k7s.m148642b(this, layoutInflater, viewGroup);
    }

    @Override // p153l.iam
    /* JADX INFO: renamed from: d2, reason: merged with bridge method [inline-methods] */
    public void mo22064i1(w7s w7sVar) {
        this.f52050k = w7sVar;
    }

    @Override // p153l.iam
    public void destroy() {
    }

    /* JADX INFO: renamed from: e2 */
    public Picture m76657e2() {
        return this.f52051l;
    }

    @Override // com.p051p1.mobile.android.app.Act
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return m76655b2(layoutInflater, viewGroup);
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act
    public void initDataOnCreate() {
        super.initDataOnCreate();
        Act act = this.act;
        new w7s(act, act).mo52715C(this);
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act
    public void initSubscription() {
        super.initSubscription();
        this.f52050k.mo40473a0();
    }

    /* JADX INFO: renamed from: l2 */
    public void m76658l2(boolean z, String str) {
        int iM175859d = qa00.m175859d(20.0f);
        izs.m142868s("context_livingAct", this.f52044e, str);
        VDraweeView vDraweeView = this.f52042c;
        if (z) {
            izs.m142865p("context_livingAct", vDraweeView, str, 1, iM175859d);
        } else {
            izs.m142866q(vDraweeView, str, 1, iM175859d);
            this.f52049j.setEnabled(true);
        }
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct
    public void onPickImagesResult(List<Media> list) {
        if (jyb.m147479J(list)) {
            return;
        }
        this.f52051l = (Picture) list.get(0);
        this.f52049j.setEnabled(true);
        m76658l2(false, this.f52051l.url);
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act
    public void onRestoreGlobalState(Bundle bundle) {
        super.onRestoreGlobalState(bundle);
        this.f52051l = (Picture) bundle.getSerializable("changed_picture");
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act
    public void onSaveGlobalState(Bundle bundle) {
        super.onSaveGlobalState(bundle);
        Picture picture = this.f52051l;
        if (picture != null) {
            bundle.putSerializable("changed_picture", picture);
        }
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act
    public void preCreateView(Bundle bundle) {
        super.preCreateView(bundle);
        this.f52050k.m205373C0(getIntent().getStringExtra("old_room_info_tag"), getIntent().getStringExtra("from_tag"));
    }
}
