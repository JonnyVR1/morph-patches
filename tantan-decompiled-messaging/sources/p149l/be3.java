package p149l;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.DialogInterface;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.Nullable;
import com.p046p1.mobile.putong.live.livingroom.archi.dialogcenter.DialogC12611a;
import com.p046p1.mobile.putong.live.livingroom.view.VoiceSettingView;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public class be3 implements s7m<lne0> {

    /* JADX INFO: renamed from: a */
    public VoiceSettingView f75101a;

    /* JADX INFO: renamed from: b */
    public DialogC12611a f75102b;

    /* JADX INFO: renamed from: c */
    public lne0 f75103c;

    /* JADX INFO: renamed from: d */
    public final List<tb3<?>> f75104d = new ArrayList();

    @Override // p149l.s7m
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return this.f75103c.act();
    }

    @Override // p149l.s7m
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public void mo21065i1(lne0 lne0Var) {
        this.f75103c = lne0Var;
    }

    /* JADX INFO: renamed from: e */
    public void m101310e() {
        DialogC12611a dialogC12611a = this.f75102b;
        if (dialogC12611a == null || !dialogC12611a.isShowing()) {
            return;
        }
        this.f75102b.dismiss();
    }

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ void m101311f(View view) {
        VoiceSettingView voiceSettingView = (VoiceSettingView) view;
        this.f75101a = voiceSettingView;
        voiceSettingView.setModels(this.f75104d);
    }

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ void m101312i(DialogInterface dialogInterface) {
        VoiceSettingView voiceSettingView;
        if (vwb.m200296J(this.f75104d) || (voiceSettingView = this.f75101a) == null) {
            return;
        }
        voiceSettingView.setModels(this.f75104d);
    }

    @Override // p149l.s7m
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return null;
    }

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ void m101313j(DialogInterface dialogInterface) {
        this.f75103c.m150681U3();
    }

    /* JADX INFO: renamed from: k */
    public void m101314k(List<tb3<?>> list) {
        this.f75104d.clear();
        this.f75104d.addAll(list);
        VoiceSettingView voiceSettingView = this.f75101a;
        if (voiceSettingView != null) {
            voiceSettingView.setModels(this.f75104d);
        }
    }

    @SuppressLint({"InflateParams"})
    /* JADX INFO: renamed from: l */
    public void m101315l() {
        if (this.f75102b == null) {
            byr byrVar = new byr(this.f75103c, t6c0.f168373ha);
            this.f75102b = byrVar;
            byrVar.m71776h0(new e30() { // from class: l.yd3
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f197517a.m101311f((View) obj);
                }
            });
            this.f75102b.setOnShowListener(new DialogInterface.OnShowListener() { // from class: l.zd3
                @Override // android.content.DialogInterface.OnShowListener
                public final void onShow(DialogInterface dialogInterface) {
                    this.f202617a.m101312i(dialogInterface);
                }
            });
            this.f75102b.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: l.ae3
                @Override // android.content.DialogInterface.OnDismissListener
                public final void onDismiss(DialogInterface dialogInterface) {
                    this.f68987a.m101313j(dialogInterface);
                }
            });
        }
        this.f75102b.show();
    }

    @Override // p149l.s7m
    public void destroy() {
    }
}
