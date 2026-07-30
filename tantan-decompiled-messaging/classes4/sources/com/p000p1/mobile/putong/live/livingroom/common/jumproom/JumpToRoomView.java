package com.p000p1.mobile.putong.live.livingroom.common.jumproom;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p000p1.mobile.putong.live.livingroom.R$string;
import l.s7m;
import l.ypv;
import p002l.xqq;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class JumpToRoomView extends FrameLayout implements s7m<C0351a> {

    /* JADX INFO: renamed from: a */
    public VText f5232a;

    /* JADX INFO: renamed from: b */
    public C0351a f5233b;

    public JumpToRoomView(@NonNull Context context) {
        super(context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e */
    public /* synthetic */ void m6559e(View view) {
        m6563d();
        C0351a c0351a = this.f5233b;
        if (c0351a != null) {
            c0351a.m6571M3();
        }
    }

    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context m6560C0() {
        return null;
    }

    /* JADX INFO: renamed from: b */
    public final void m6561b(View view) {
        xqq.m26068a(this, view);
    }

    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public void m6565i1(C0351a c0351a) {
        this.f5233b = c0351a;
    }

    /* JADX INFO: renamed from: d */
    public void m6563d() {
        setVisibility(8);
        this.f5232a.setText("");
    }

    public void destroy() {
    }

    /* JADX INFO: renamed from: f */
    public void m6564f(JumpRoomData jumpRoomData) {
        int i = R$string.f3234dc;
        String oldAnchorName = jumpRoomData.getOldAnchorName();
        if ("voice-live".equals(jumpRoomData.getLiveType())) {
            i = R$string.f3212cc;
        }
        setVisibility(0);
        VText vText = this.f5232a;
        String string = ypv.e.getString(i);
        if (oldAnchorName.length() > 5) {
            oldAnchorName = oldAnchorName.substring(0, 5).concat("...");
        }
        vText.setText(String.format(string, oldAnchorName));
    }

    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return null;
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m6561b(this);
        setOnClickListener(new View.OnClickListener() { // from class: l.wqq
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f21936a.m6559e(view);
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
