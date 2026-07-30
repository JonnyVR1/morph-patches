package p153l;

import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.R$string;
import com.p051p1.mobile.putong.data.IntlMoreGender;
import com.p051p1.mobile.putong.data.LookingFor;
import com.p051p1.mobile.putong.data.SettingGroups;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(m88120d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\f\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0015\u0010\u000e\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u000e\u0010\rR\u0016\u0010\u0012\u001a\u00020\u000f8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011¨\u0006\u0013"}, m88121d2 = {"Ll/ncp;", "Ll/ar2;", "Ll/xcp;", "Ll/ner;", "lifecycleProvider", "<init>", "(Ll/ner;)V", "", "destroy", "()V", "Lcom/p1/mobile/putong/data/SettingGroups;", "data", "g0", "(Lcom/p1/mobile/putong/data/SettingGroups;)V", "h0", "Lcom/p1/mobile/putong/data/IntlMoreGender;", "a", "Lcom/p1/mobile/putong/data/IntlMoreGender;", "_data", "b_core_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
public final class ncp extends ar2<xcp> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public IntlMoreGender _data;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ncp(@NotNull ner nerVar) {
        super(nerVar);
        nerVar.getClass();
    }

    /* JADX INFO: renamed from: i0 */
    public static final void m162586i0(Act act, ncp ncpVar, uxj0 uxj0Var) {
        Act act2;
        act.progressDismiss();
        Act act3 = ncpVar.act();
        if (act3 == null || act3.isFinishing() || (act2 = ncpVar.act()) == null) {
            return;
        }
        act2.m68056e2();
    }

    /* JADX INFO: renamed from: j0 */
    public static final void m162587j0(Act act, Throwable th) {
        act.progressDismiss();
        o1j0.m165634h(R$string.f19698u4);
    }

    /* JADX INFO: renamed from: g0 */
    public final void m162588g0(@NotNull SettingGroups data) {
        data.getClass();
        IntlMoreGender intlMoreGenderMo225055clone = data.gender.mo225055clone();
        intlMoreGenderMo225055clone.getClass();
        this._data = intlMoreGenderMo225055clone;
        ((xcp) this.viewModel).m210259r();
        ((xcp) this.viewModel).m210250B(data);
    }

    /* JADX WARN: Code duplicated, block: B:38:0x009b  */
    /* JADX INFO: renamed from: h0 */
    public final void m162589h0(@NotNull SettingGroups data) {
        final Act act;
        boolean z;
        data.getClass();
        if (!CoreModule.m30929H().signedIn_() || (act = act()) == null) {
            return;
        }
        SettingGroups settingGroups = new SettingGroups();
        IntlMoreGender intlMoreGender = this._data;
        IntlMoreGender intlMoreGender2 = null;
        if (intlMoreGender == null) {
            Intrinsics.m88391r("_data");
            intlMoreGender = null;
        }
        if (Intrinsics.m88377d(intlMoreGender.newGender, data.gender.newGender)) {
            IntlMoreGender intlMoreGender3 = this._data;
            if (intlMoreGender3 == null) {
                Intrinsics.m88391r("_data");
                intlMoreGender3 = null;
            }
            if (Intrinsics.m88377d(intlMoreGender3.subGender, data.gender.subGender)) {
                IntlMoreGender intlMoreGender4 = this._data;
                if (intlMoreGender4 == null) {
                    Intrinsics.m88391r("_data");
                    intlMoreGender4 = null;
                }
                if (Intrinsics.m88377d(intlMoreGender4.showOnProfile, data.gender.showOnProfile)) {
                    IntlMoreGender intlMoreGender5 = this._data;
                    if (intlMoreGender5 == null) {
                        Intrinsics.m88391r("_data");
                        intlMoreGender5 = null;
                    }
                    if (Intrinsics.m88377d(intlMoreGender5.canUpdate, data.gender.canUpdate)) {
                        IntlMoreGender intlMoreGender6 = this._data;
                        if (intlMoreGender6 == null) {
                            Intrinsics.m88391r("_data");
                            intlMoreGender6 = null;
                        }
                        if (Intrinsics.m88377d(intlMoreGender6.notShowCis, data.gender.notShowCis)) {
                            IntlMoreGender intlMoreGender7 = this._data;
                            if (intlMoreGender7 == null) {
                                Intrinsics.m88391r("_data");
                                intlMoreGender7 = null;
                            }
                            if (intlMoreGender7.lookingForGenders.size() != data.gender.lookingForGenders.size()) {
                                z = true;
                            } else {
                                z = false;
                            }
                        } else {
                            z = true;
                        }
                    } else {
                        z = true;
                    }
                } else {
                    z = true;
                }
            } else {
                z = true;
            }
        } else {
            z = true;
        }
        if (!z) {
            IntlMoreGender intlMoreGender8 = this._data;
            if (intlMoreGender8 == null) {
                Intrinsics.m88391r("_data");
            } else {
                intlMoreGender2 = intlMoreGender8;
            }
            List<LookingFor> list = intlMoreGender2.lookingForGenders;
            List<LookingFor> list2 = data.gender.lookingForGenders;
            list2.getClass();
            z = !list.containsAll(list2);
        }
        if (z) {
            act.progress(R$string.f18632L5);
            settingGroups.gender = data.gender;
            duringCreated(CoreModule.f18264c.f20405m0.m32124k8(settingGroups)).subscribe(psd0.m173597H(new y20() { // from class: l.lcp
                @Override // p153l.y20
                public final void call(Object obj) {
                    ncp.m162586i0(act, this, (uxj0) obj);
                }
            }, new y20() { // from class: l.mcp
                @Override // p153l.y20
                public final void call(Object obj) {
                    ncp.m162587j0(act, (Throwable) obj);
                }
            }));
        } else {
            Act act2 = act();
            if (act2 != null) {
                act2.m68056e2();
            }
        }
    }

    @Override // p153l.k3m
    public void destroy() {
    }
}
