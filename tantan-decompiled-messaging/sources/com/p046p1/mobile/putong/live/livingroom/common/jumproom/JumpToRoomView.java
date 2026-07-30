package com.p046p1.mobile.putong.live.livingroom.common.jumproom;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p046p1.mobile.putong.live.base.data.BLiveAbsData;
import com.p046p1.mobile.putong.live.livingroom.R$string;
import p147v.VText;
import p149l.s7m;
import p149l.xqq;
import p149l.ypv;

/* JADX INFO: loaded from: classes4.dex */
public class JumpToRoomView extends FrameLayout implements s7m<C12762a> {

    /* JADX INFO: renamed from: a */
    public VText f49190a;

    /* JADX INFO: renamed from: b */
    public C12762a f49191b;

    public JumpToRoomView(@NonNull Context context) {
        super(context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e */
    public /* synthetic */ void m73036e(View view) {
        m73039d();
        C12762a c12762a = this.f49191b;
        if (c12762a != null) {
            c12762a.m73046M3();
        }
    }

    @Override // p149l.s7m
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return null;
    }

    /* JADX INFO: renamed from: b */
    public final void m73037b(View view) {
        xqq.m210591a(this, view);
    }

    @Override // p149l.s7m
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public void mo21065i1(C12762a c12762a) {
        this.f49191b = c12762a;
    }

    /* JADX INFO: renamed from: d */
    public void m73039d() {
        setVisibility(8);
        this.f49190a.setText("");
    }

    @Override // p149l.s7m
    public void destroy() {
    }

    /* JADX INFO: renamed from: f */
    public void m73040f(JumpRoomData jumpRoomData) {
        int i = R$string.f47192dc;
        String oldAnchorName = jumpRoomData.getOldAnchorName();
        if (BLiveAbsData.VOICE_LIVE.equals(jumpRoomData.getLiveType())) {
            i = R$string.f47170cc;
        }
        setVisibility(0);
        VText vText = this.f49190a;
        String string = ypv.f199497e.getString(i);
        if (oldAnchorName.length() > 5) {
            oldAnchorName = oldAnchorName.substring(0, 5).concat("...");
        }
        vText.setText(String.format(string, oldAnchorName));
    }

    @Override // p149l.s7m
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return null;
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m73037b(this);
        setOnClickListener(new View.OnClickListener() { // from class: l.wqq
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f187717a.m73036e(view);
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
