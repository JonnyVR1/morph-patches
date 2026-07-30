package p149l;

import android.os.Bundle;
import com.p046p1.mobile.putong.core.p053ui.profile.loop.LoopInputType;
import com.p046p1.mobile.putong.data.IntlProfileInfo;
import com.p046p1.mobile.putong.data.User;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m87231d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\b\u0010\tJ\u0019\u0010\u000b\u001a\u00020\u00072\b\u0010\n\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\r\u0010\tJ\u0015\u0010\u0010\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0012\u0010\tR\u001e\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\"\u0010\u001e\u001a\u00020\u00188\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010\r\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001d¨\u0006\u001f"}, m87232d2 = {"Ll/pha0;", "Ll/jq2;", "Ll/qha0;", "Ll/mcr;", "lifecycleProvider", "<init>", "(Ll/mcr;)V", "", "i0", "()V", "viewModel", "f0", "(Ll/qha0;)V", "Z", "Lcom/p1/mobile/putong/data/User;", "user", "g0", "(Lcom/p1/mobile/putong/data/User;)V", "destroy", "", "Lcom/p1/mobile/putong/data/IntlProfileInfo;", "a", "Ljava/util/List;", "fillData", "", "b", "h0", "()Z", "setLanguageType$profile_intlGmsRelease", "(Z)V", "languageType", "profile_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
@SourceDebugExtension
public final class pha0 extends jq2<qha0> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @Nullable
    public List<? extends IntlProfileInfo> fillData;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public boolean languageType;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pha0(@NotNull mcr mcrVar) {
        super(mcrVar);
        mcrVar.getClass();
    }

    /* JADX INFO: renamed from: e0 */
    public static void m168932e0(pha0 pha0Var, Bundle bundle) {
        pha0Var.m168933i0();
    }

    /* JADX INFO: renamed from: i0 */
    private final void m168933i0() {
        ArrayList arrayList;
        Bundle bundleM174520f = ((qha0) this.viewModel).m174520f();
        Serializable serializable = bundleM174520f != null ? bundleM174520f.getSerializable("loop_input_type") : null;
        serializable.getClass();
        boolean z = ((LoopInputType) serializable) == LoopInputType.LANGUAGE;
        this.languageType = z;
        if (z) {
            List<IntlProfileInfo> listM159388c = nha0.INSTANCE.m159388c();
            listM159388c.getClass();
            arrayList = (ArrayList) listM159388c;
        } else {
            List<IntlProfileInfo> listM159387b = nha0.INSTANCE.m159387b();
            listM159387b.getClass();
            arrayList = (ArrayList) listM159387b;
        }
        this.fillData = arrayList;
        qha0 qha0Var = (qha0) this.viewModel;
        if (qha0Var != null) {
            qha0Var.m174525m(arrayList, this.languageType);
        }
    }

    @Override // p149l.jq2
    /* JADX INFO: renamed from: Z */
    public void mo39469Z() {
        super.mo39469Z();
        creates(new e30() { // from class: l.oha0
            @Override // p149l.e30
            public final void call(Object obj) {
                pha0.m168932e0(this.f143961a, (Bundle) obj);
            }
        });
    }

    @Override // p149l.jq2, p149l.q0m
    /* JADX INFO: renamed from: f0, reason: merged with bridge method [inline-methods] */
    public void mo51532C(@Nullable qha0 viewModel) {
        super.mo51532C(viewModel);
    }

    /* JADX INFO: renamed from: g0 */
    public final void m168935g0(@NotNull User user) {
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
        nha0.INSTANCE.m159392g(arrayList, this.languageType);
        if (vwb.m200296J(arrayList)) {
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

    @Override // p149l.q0m
    public void destroy() {
    }
}
