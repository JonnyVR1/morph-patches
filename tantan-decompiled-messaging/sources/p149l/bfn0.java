package p149l;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.DialogInterface;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.Nullable;
import com.p046p1.mobile.putong.live.livingroom.archi.dialogcenter.DialogC12611a;
import com.p046p1.mobile.putong.live.livingroom.voice.bottom.VoiceIntlSettingLayout;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes5.dex */
public class bfn0 implements s7m<sfn0> {

    /* JADX INFO: renamed from: a */
    public VoiceIntlSettingLayout f75332a;

    /* JADX INFO: renamed from: b */
    public DialogC12611a f75333b;

    /* JADX INFO: renamed from: c */
    public sfn0 f75334c;

    /* JADX INFO: renamed from: d */
    public Map<String, List<tb3<?>>> f75335d;

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f */
    public /* synthetic */ void m101553f(View view) {
        VoiceIntlSettingLayout voiceIntlSettingLayout = (VoiceIntlSettingLayout) view;
        this.f75332a = voiceIntlSettingLayout;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i */
    public /* synthetic */ void m101554i(DialogInterface dialogInterface) {
        VoiceIntlSettingLayout voiceIntlSettingLayout;
        Map<String, List<tb3<?>>> map = this.f75335d;
        if (map == null || (voiceIntlSettingLayout = this.f75332a) == null) {
            return;
        }
        voiceIntlSettingLayout.m77784h(map, this.f75334c.f164319j.f101794d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j */
    public /* synthetic */ void m101555j(DialogInterface dialogInterface) {
        this.f75334c.m183977j4();
    }

    @Override // p149l.s7m
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return this.f75334c.act();
    }

    @Override // p149l.s7m
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public void mo21065i1(sfn0 sfn0Var) {
        this.f75334c = sfn0Var;
    }

    /* JADX INFO: renamed from: e */
    public void m101557e() {
        DialogC12611a dialogC12611a = this.f75333b;
        if (dialogC12611a == null || !dialogC12611a.isShowing()) {
            return;
        }
        this.f75333b.dismiss();
    }

    @Override // p149l.s7m
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return null;
    }

    /* JADX INFO: renamed from: k */
    public void m101558k(Map<String, List<tb3<?>>> map) {
        this.f75335d = map;
    }

    @SuppressLint({"InflateParams"})
    /* JADX INFO: renamed from: l */
    public void m101559l() {
        if (this.f75333b == null) {
            byr byrVar = new byr(this.f75334c, t6c0.f168398j9);
            this.f75333b = byrVar;
            byrVar.m71776h0(new e30() { // from class: l.yen0
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f197699a.m101553f((View) obj);
                }
            });
            this.f75333b.setOnShowListener(new DialogInterface.OnShowListener() { // from class: l.zen0
                @Override // android.content.DialogInterface.OnShowListener
                public final void onShow(DialogInterface dialogInterface) {
                    this.f202853a.m101554i(dialogInterface);
                }
            });
            this.f75333b.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: l.afn0
                @Override // android.content.DialogInterface.OnDismissListener
                public final void onDismiss(DialogInterface dialogInterface) {
                    this.f69200a.m101555j(dialogInterface);
                }
            });
        }
        this.f75333b.show();
    }

    @Override // p149l.s7m
    public void destroy() {
    }
}
