package p149l;

import com.google.firebase.analytics.FirebaseAnalytics;

/* JADX INFO: loaded from: classes6.dex */
public final class qfw0 extends vfw0 {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ rfw0 f154295g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qfw0(rfw0 rfw0Var, xfw0 xfw0Var, CharSequence charSequence) {
        super(xfw0Var, charSequence);
        this.f154295g = rfw0Var;
    }

    @Override // p149l.vfw0
    /* JADX INFO: renamed from: b */
    public final int mo174374b(int i) {
        return i + 1;
    }

    @Override // p149l.vfw0
    /* JADX INFO: renamed from: c */
    public final int mo174375c(int i) {
        CharSequence charSequence = this.f181318c;
        int length = charSequence.length();
        nfw0.m159280b(i, length, FirebaseAnalytics.Param.INDEX);
        while (i < length) {
            rfw0 rfw0Var = this.f154295g;
            if (rfw0Var.f159207a.mo183725a(charSequence.charAt(i))) {
                return i;
            }
            i++;
        }
        return -1;
    }
}
