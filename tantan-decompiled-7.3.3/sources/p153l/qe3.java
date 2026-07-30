package p153l;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.DialogInterface;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.Nullable;
import com.p051p1.mobile.putong.live.livingroom.archi.dialogcenter.DialogC12774a;
import com.p051p1.mobile.putong.live.livingroom.view.VoiceSettingView;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public class qe3 implements iam<sve0> {

    /* JADX INFO: renamed from: a */
    public VoiceSettingView f156788a;

    /* JADX INFO: renamed from: b */
    public DialogC12774a f156789b;

    /* JADX INFO: renamed from: c */
    public sve0 f156790c;

    /* JADX INFO: renamed from: d */
    public final List<ic3<?>> f156791d = new ArrayList();

    @Override // p153l.iam
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return this.f156790c.act();
    }

    @Override // p153l.iam
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public void mo22064i1(sve0 sve0Var) {
        this.f156790c = sve0Var;
    }

    /* JADX INFO: renamed from: e */
    public void m176226e() {
        DialogC12774a dialogC12774a = this.f156789b;
        if (dialogC12774a == null || !dialogC12774a.isShowing()) {
            return;
        }
        this.f156789b.dismiss();
    }

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ void m176227f(View view) {
        VoiceSettingView voiceSettingView = (VoiceSettingView) view;
        this.f156788a = voiceSettingView;
        voiceSettingView.setModels(this.f156791d);
    }

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ void m176228i(DialogInterface dialogInterface) {
        VoiceSettingView voiceSettingView;
        if (jyb.m147479J(this.f156791d) || (voiceSettingView = this.f156788a) == null) {
            return;
        }
        voiceSettingView.setModels(this.f156791d);
    }

    @Override // p153l.iam
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return null;
    }

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ void m176229j(DialogInterface dialogInterface) {
        this.f156790c.m188207U3();
    }

    /* JADX INFO: renamed from: k */
    public void m176230k(List<ic3<?>> list) {
        this.f156791d.clear();
        this.f156791d.addAll(list);
        VoiceSettingView voiceSettingView = this.f156788a;
        if (voiceSettingView != null) {
            voiceSettingView.setModels(this.f156791d);
        }
    }

    @SuppressLint({"InflateParams"})
    /* JADX INFO: renamed from: l */
    public void m176231l() {
        if (this.f156789b == null) {
            c0s c0sVar = new c0s(this.f156790c, yec0.f199105ha);
            this.f156789b = c0sVar;
            c0sVar.m72959h0(new y20() { // from class: l.ne3
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f141570a.m176227f((View) obj);
                }
            });
            this.f156789b.setOnShowListener(new DialogInterface.OnShowListener() { // from class: l.oe3
                @Override // android.content.DialogInterface.OnShowListener
                public final void onShow(DialogInterface dialogInterface) {
                    this.f146963a.m176228i(dialogInterface);
                }
            });
            this.f156789b.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: l.pe3
                @Override // android.content.DialogInterface.OnDismissListener
                public final void onDismiss(DialogInterface dialogInterface) {
                    this.f151863a.m176229j(dialogInterface);
                }
            });
        }
        this.f156789b.show();
    }

    @Override // p153l.iam
    public void destroy() {
    }
}
