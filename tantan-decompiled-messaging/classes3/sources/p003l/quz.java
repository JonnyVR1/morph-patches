package p003l;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import androidx.annotation.Nullable;
import com.p000p1.mobile.putong.core.p001ui.messages.MessagesAct;
import com.tantanapp.common.utils.NullChecker;
import l.ouz;
import l.ruz;
import l.s7m;
import p028v.VCheckBox;
import p028v.VRelative;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class quz implements s7m<ouz> {

    /* JADX INFO: renamed from: a */
    public VRelative f6700a;

    /* JADX INFO: renamed from: b */
    public VCheckBox f6701b;

    /* JADX INFO: renamed from: c */
    public MessagesAct f6702c;

    /* JADX INFO: renamed from: d */
    public ouz f6703d;

    public quz(MessagesAct messagesAct) {
        this.f6702c = messagesAct;
    }

    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context m7036C0() {
        return this.f6702c;
    }

    /* JADX INFO: renamed from: b */
    public View m7037b(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return ruz.b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public void m7041i1(ouz ouzVar) {
        this.f6703d = ouzVar;
    }

    /* JADX INFO: renamed from: d */
    public void m7039d() {
        if (NullChecker.a(this.f6701b)) {
            this.f6701b.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: l.puz
                @Override // android.widget.CompoundButton.OnCheckedChangeListener
                public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                    this.f6520a.m7040e(compoundButton, z);
                }
            });
        }
    }

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ void m7040e(CompoundButton compoundButton, boolean z) {
        if (this.f6702c.mo2051E() != null) {
            this.f6702c.mo2051E().q0(z);
        }
    }

    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return m7037b(layoutInflater, viewGroup);
    }

    public void destroy() {
    }
}
