package com.p051p1.mobile.putong.live.livingroom.common.jumproom;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p051p1.mobile.putong.live.base.data.BLiveAbsData;
import com.p051p1.mobile.putong.live.livingroom.R$string;
import p151v.VText;
import p153l.iam;
import p153l.ysq;
import p153l.zrv;

/* JADX INFO: loaded from: classes4.dex */
public class JumpToRoomView extends FrameLayout implements iam<C12925a> {

    /* JADX INFO: renamed from: a */
    public VText f50038a;

    /* JADX INFO: renamed from: b */
    public C12925a f50039b;

    public JumpToRoomView(@NonNull Context context) {
        super(context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e */
    public /* synthetic */ void m74219e(View view) {
        m74222d();
        C12925a c12925a = this.f50039b;
        if (c12925a != null) {
            c12925a.m74229M3();
        }
    }

    @Override // p153l.iam
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return null;
    }

    /* JADX INFO: renamed from: b */
    public final void m74220b(View view) {
        ysq.m217261a(this, view);
    }

    @Override // p153l.iam
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public void mo22064i1(C12925a c12925a) {
        this.f50039b = c12925a;
    }

    /* JADX INFO: renamed from: d */
    public void m74222d() {
        setVisibility(8);
        this.f50038a.setText("");
    }

    @Override // p153l.iam
    public void destroy() {
    }

    /* JADX INFO: renamed from: f */
    public void m74223f(JumpRoomData jumpRoomData) {
        int i = R$string.f48040dc;
        String oldAnchorName = jumpRoomData.getOldAnchorName();
        if (BLiveAbsData.VOICE_LIVE.equals(jumpRoomData.getLiveType())) {
            i = R$string.f48018cc;
        }
        setVisibility(0);
        VText vText = this.f50038a;
        String string = zrv.f205803e.getString(i);
        if (oldAnchorName.length() > 5) {
            oldAnchorName = oldAnchorName.substring(0, 5).concat("...");
        }
        vText.setText(String.format(string, oldAnchorName));
    }

    @Override // p153l.iam
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return null;
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m74220b(this);
        setOnClickListener(new View.OnClickListener() { // from class: l.xsq
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f196120a.m74219e(view);
            }
        });
    }

    public JumpToRoomView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public JumpToRoomView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
