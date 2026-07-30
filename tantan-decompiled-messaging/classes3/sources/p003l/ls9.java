package p003l;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.Nullable;
import com.p000p1.mobile.putong.core.p001ui.messages.meme.CoreMemePhotoZoomAct;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.app.PutongMvpAct;
import com.p1.mobile.putong.core.message.R;
import com.p1.mobile.putong.data.Media;
import java.util.ArrayList;
import l.ms9;
import l.qib0;
import l.s7m;
import l.vwb;
import l.xdl0;
import l.zvf0;
import p028v.VDraweeView;
import p028v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class ls9 implements s7m<js9> {

    /* JADX INFO: renamed from: a */
    public VDraweeView f5401a;

    /* JADX INFO: renamed from: b */
    public View f5402b;

    /* JADX INFO: renamed from: c */
    public VText f5403c;

    /* JADX INFO: renamed from: d */
    public js9 f5404d;

    /* JADX INFO: renamed from: e */
    public CoreMemePhotoZoomAct f5405e;

    public ls9(CoreMemePhotoZoomAct coreMemePhotoZoomAct) {
        this.f5405e = coreMemePhotoZoomAct;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX INFO: renamed from: e */
    public /* synthetic */ void m6143e(ArrayList arrayList, View view) {
        zvf0.r("e_add_stickers", this.f5405e.pageId());
        PutongMvpAct putongMvpAct = this.f5405e;
        putongMvpAct.progress(putongMvpAct.getString(R.string.p7));
        this.f5404d.m5434s0((Media) arrayList.get(0));
    }

    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context m6144C0() {
        return this.f5405e;
    }

    @Nullable
    public Act act() {
        return this.f5405e;
    }

    /* JADX INFO: renamed from: b */
    public View m6145b(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return ms9.b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public void m6148i1(js9 js9Var) {
        this.f5404d = js9Var;
    }

    /* JADX INFO: renamed from: d */
    public void m6147d(final ArrayList<Media> arrayList) {
        if (vwb.J(arrayList)) {
            return;
        }
        qib0.G.i0(this.f5401a, arrayList.get(0).url);
        xdl0.E0(this.f5403c, new View.OnClickListener() { // from class: l.ks9
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f5020a.m6143e(arrayList, view);
            }
        });
    }

    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return m6145b(layoutInflater, viewGroup);
    }

    public void destroy() {
    }
}
