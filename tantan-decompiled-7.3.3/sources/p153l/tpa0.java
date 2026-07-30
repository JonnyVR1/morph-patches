package p153l;

import android.os.Bundle;
import com.p051p1.mobile.putong.core.p058ui.profile.loop.LoopInputType;
import com.p051p1.mobile.putong.data.IntlProfileInfo;
import com.p051p1.mobile.putong.data.User;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(m88120d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\b\u0010\tJ\u0019\u0010\u000b\u001a\u00020\u00072\b\u0010\n\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\r\u0010\tJ\u0015\u0010\u0010\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0012\u0010\tR\u001e\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\"\u0010\u001e\u001a\u00020\u00188\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010\r\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001d¨\u0006\u001f"}, m88121d2 = {"Ll/tpa0;", "Ll/ar2;", "Ll/upa0;", "Ll/ner;", "lifecycleProvider", "<init>", "(Ll/ner;)V", "", "i0", "()V", "viewModel", "f0", "(Ll/upa0;)V", "Z", "Lcom/p1/mobile/putong/data/User;", "user", "g0", "(Lcom/p1/mobile/putong/data/User;)V", "destroy", "", "Lcom/p1/mobile/putong/data/IntlProfileInfo;", "a", "Ljava/util/List;", "fillData", "", "b", "h0", "()Z", "setLanguageType$profile_intlGmsRelease", "(Z)V", "languageType", "profile_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
@SourceDebugExtension
public final class tpa0 extends ar2<upa0> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @Nullable
    public List<? extends IntlProfileInfo> fillData;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public boolean languageType;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tpa0(@NotNull ner nerVar) {
        super(nerVar);
        nerVar.getClass();
    }

    /* JADX INFO: renamed from: e0 */
    public static void m192121e0(tpa0 tpa0Var, Bundle bundle) {
        tpa0Var.m192122i0();
    }

    /* JADX INFO: renamed from: i0 */
    private final void m192122i0() {
        ArrayList arrayList;
        Bundle bundleM197059f = ((upa0) this.viewModel).m197059f();
        Serializable serializable = bundleM197059f != null ? bundleM197059f.getSerializable("loop_input_type") : null;
        serializable.getClass();
        boolean z = ((LoopInputType) serializable) == LoopInputType.LANGUAGE;
        this.languageType = z;
        if (z) {
            List<IntlProfileInfo> listM182514c = rpa0.INSTANCE.m182514c();
            listM182514c.getClass();
            arrayList = (ArrayList) listM182514c;
        } else {
            List<IntlProfileInfo> listM182513b = rpa0.INSTANCE.m182513b();
            listM182513b.getClass();
            arrayList = (ArrayList) listM182513b;
        }
        this.fillData = arrayList;
        upa0 upa0Var = (upa0) this.viewModel;
        if (upa0Var != null) {
            upa0Var.m197064m(arrayList, this.languageType);
        }
    }

    @Override // p153l.ar2
    /* JADX INFO: renamed from: Z */
    public void mo40472Z() {
        super.mo40472Z();
        creates(new y20() { // from class: l.spa0
            @Override // p153l.y20
            public final void call(Object obj) {
                tpa0.m192121e0(this.f170022a, (Bundle) obj);
            }
        });
    }

    @Override // p153l.ar2, p153l.k3m
    /* JADX INFO: renamed from: f0, reason: merged with bridge method [inline-methods] */
    public void mo52715C(@Nullable upa0 viewModel) {
        super.mo52715C(viewModel);
    }

    /* JADX INFO: renamed from: g0 */
    public final void m192124g0(@NotNull User user) {
        user.getClass();
        ArrayList arrayList = new ArrayList();
        List<? extends IntlProfileInfo> list = this.fillData;
        if (list != null) {
            for (IntlProfileInfo intlProfileInfo : list) {
                if (intlProfileInfo.selected) {
                    arrayList.add(intlProfileInfo.key);
                }
            }
        }
        rpa0.INSTANCE.m182518g(arrayList, this.languageType);
        if (jyb.m147479J(arrayList)) {
            return;
        }
        if (this.languageType) {
            user.profile.extensions.basic.language = arrayList;
        } else {
            user.profile.extensions.basic.ethnicity = arrayList;
        }
    }

    /* JADX INFO: renamed from: h0, reason: from getter */
    public final boolean getLanguageType() {
        return this.languageType;
    }

    @Override // p153l.k3m
    public void destroy() {
    }
}
