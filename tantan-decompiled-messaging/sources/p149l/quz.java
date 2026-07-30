package p149l;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import androidx.annotation.Nullable;
import com.p046p1.mobile.putong.core.p053ui.messages.MessagesAct;
import com.tantanapp.common.utils.NullChecker;
import p147v.VCheckBox;
import p147v.VRelative;

/* JADX INFO: loaded from: classes3.dex */
public class quz implements s7m<ouz> {

    /* JADX INFO: renamed from: a */
    public VRelative f156562a;

    /* JADX INFO: renamed from: b */
    public VCheckBox f156563b;

    /* JADX INFO: renamed from: c */
    public MessagesAct f156564c;

    /* JADX INFO: renamed from: d */
    public ouz f156565d;

    public quz(MessagesAct messagesAct) {
        this.f156564c = messagesAct;
    }

    @Override // p149l.s7m
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return this.f156564c;
    }

    /* JADX INFO: renamed from: b */
    public View m176666b(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return ruz.m181228b(this, layoutInflater, viewGroup);
    }

    @Override // p149l.s7m
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public void mo21065i1(ouz ouzVar) {
        this.f156565d = ouzVar;
    }

    /* JADX INFO: renamed from: d */
    public void m176668d() {
        if (NullChecker.m81303a(this.f156563b)) {
            this.f156563b.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: l.puz
                @Override // android.widget.CompoundButton.OnCheckedChangeListener
                public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                    this.f151375a.m176669e(compoundButton, z);
                }
            });
        }
    }

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ void m176669e(CompoundButton compoundButton, boolean z) {
        if (this.f156564c.mo48959E() != null) {
            this.f156564c.mo48959E().m194280q0(z);
        }
    }

    @Override // p149l.s7m
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return m176666b(layoutInflater, viewGroup);
    }

    @Override // p149l.s7m
    public void destroy() {
    }
}
