package p149l;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.DialogInterface;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.Nullable;
import com.p046p1.mobile.putong.live.livingroom.archi.dialogcenter.DialogC12611a;
import com.p046p1.mobile.putong.live.livingroom.voice.intl.emoji.VoiceMicEmojiDialogLayout;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public class v0o0 implements s7m<r1o0> {

    /* JADX INFO: renamed from: a */
    public VoiceMicEmojiDialogLayout f179130a;

    /* JADX INFO: renamed from: b */
    public DialogC12611a f179131b;

    /* JADX INFO: renamed from: c */
    public r1o0 f179132c;

    /* JADX INFO: renamed from: d */
    public List<kcn0> f179133d;

    @Override // p149l.s7m
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return this.f179132c.act();
    }

    @Override // p149l.s7m
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public void mo21065i1(r1o0 r1o0Var) {
        this.f179132c = r1o0Var;
    }

    /* JADX INFO: renamed from: d */
    public void m196501d() {
        DialogC12611a dialogC12611a = this.f179131b;
        if (dialogC12611a == null || !dialogC12611a.isShowing()) {
            return;
        }
        this.f179131b.dismiss();
    }

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ void m196502e(View view) {
        this.f179130a = (VoiceMicEmojiDialogLayout) view;
    }

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ void m196503f(DialogInterface dialogInterface) {
        VoiceMicEmojiDialogLayout voiceMicEmojiDialogLayout;
        List<kcn0> list = this.f179133d;
        if (list == null || (voiceMicEmojiDialogLayout = this.f179130a) == null) {
            return;
        }
        voiceMicEmojiDialogLayout.m78119b(list);
    }

    /* JADX INFO: renamed from: i */
    public void m196504i(List<kcn0> list) {
        this.f179133d = list;
    }

    @Override // p149l.s7m
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return null;
    }

    @SuppressLint({"InflateParams"})
    /* JADX INFO: renamed from: j */
    public void m196505j() {
        if (this.f179131b == null) {
            byr byrVar = new byr(this.f179132c, t6c0.f168137O9);
            this.f179131b = byrVar;
            byrVar.m71776h0(new e30() { // from class: l.t0o0
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f167201a.m196502e((View) obj);
                }
            });
            this.f179131b.setOnShowListener(new DialogInterface.OnShowListener() { // from class: l.u0o0
                @Override // android.content.DialogInterface.OnShowListener
                public final void onShow(DialogInterface dialogInterface) {
                    this.f172934a.m196503f(dialogInterface);
                }
            });
        }
        this.f179131b.show();
    }

    @Override // p149l.s7m
    public void destroy() {
    }
}
