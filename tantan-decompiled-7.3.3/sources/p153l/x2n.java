package p153l;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.android.app.C4470c;
import com.p051p1.mobile.putong.core.p058ui.settings.intlGender.IntlAddGenderDetailsAct;
import com.p051p1.mobile.putong.data.IntlGender;
import com.p051p1.mobile.putong.data.IntlGenderItem;
import com.p051p1.mobile.putong.data.IntlMoreGender;
import com.p051p1.mobile.putong.data.SubGender;
import com.p051p1.mobile.putong.data.tenum.TEnum;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(m88120d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00072\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u000e\u0010\tJ\u0013\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0014\u001a\u0004\u0018\u00010\u0013¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0017\u001a\u00020\u00072\b\u0010\u0016\u001a\u0004\u0018\u00010\u0013¢\u0006\u0004\b\u0017\u0010\u0018R$\u0010 \u001a\u0004\u0018\u00010\u00198\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\u0018\u0010#\u001a\u0004\u0018\u00010\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u0010\"¨\u0006$"}, m88121d2 = {"Ll/x2n;", "Ll/ar2;", "Ll/b3n;", "Ll/ner;", "lifecycleProvider", "<init>", "(Ll/ner;)V", "", "destroy", "()V", "Lcom/p1/mobile/putong/data/IntlMoreGender;", "data", "j0", "(Lcom/p1/mobile/putong/data/IntlMoreGender;)V", "a0", "", "Lcom/p1/mobile/putong/data/IntlGenderItem;", "g0", "()Ljava/util/List;", "Lcom/p1/mobile/putong/data/SubGender;", "h0", "()Lcom/p1/mobile/putong/data/SubGender;", "currentSubGender", "i0", "(Lcom/p1/mobile/putong/data/SubGender;)V", "Ll/l4g0;", "a", "Ll/l4g0;", "getPageHelper", "()Ll/l4g0;", "setPageHelper", "(Ll/l4g0;)V", "pageHelper", "b", "Lcom/p1/mobile/putong/data/IntlMoreGender;", "_data", "b_core_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
public final class x2n extends ar2<b3n> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @Nullable
    public l4g0 pageHelper;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @Nullable
    public IntlMoreGender _data;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x2n(@NotNull ner nerVar) {
        super(nerVar);
        nerVar.getClass();
    }

    /* JADX INFO: renamed from: e0 */
    public static void m209156e0(x2n x2nVar, Bundle bundle) {
        V v2 = x2nVar.viewModel;
        v2.getClass();
        ((b3n) v2).m102355r();
    }

    /* JADX INFO: renamed from: f0 */
    public static void m209157f0(x2n x2nVar, C4470c c4470c) {
        c4470c.getClass();
        if (c4470c == C4470c.f16264f) {
            l4g0 l4g0Var = x2nVar.pageHelper;
            l4g0Var.getClass();
            l4g0Var.m152774i();
            return;
        }
        if (c4470c == C4470c.f16267i) {
            l4g0 l4g0Var2 = x2nVar.pageHelper;
            l4g0Var2.getClass();
            l4g0Var2.m152777l();
        } else if (c4470c == C4470c.f16268j) {
            l4g0 l4g0Var3 = x2nVar.pageHelper;
            l4g0Var3.getClass();
            l4g0Var3.m152776k();
        } else if (c4470c == C4470c.f16271m) {
            l4g0 l4g0Var4 = x2nVar.pageHelper;
            l4g0Var4.getClass();
            l4g0Var4.m152775j();
        }
    }

    @Override // p153l.ar2
    /* JADX INFO: renamed from: a0 */
    public void mo40473a0() {
        creates(new y20() { // from class: l.v2n
            @Override // p153l.y20
            public final void call(Object obj) {
                x2n.m209156e0(this.f182099a, (Bundle) obj);
            }
        });
        lifecycle().subscribe(psd0.m173596G(new y20() { // from class: l.w2n
            @Override // p153l.y20
            public final void call(Object obj) {
                x2n.m209157f0(this.f186917a, (C4470c) obj);
            }
        }));
    }

    @NotNull
    /* JADX INFO: renamed from: g0 */
    public final List<IntlGenderItem> m209158g0() {
        IntlGender intlGender;
        IntlGender intlGender2 = IntlGender.get("unknown_");
        IntlMoreGender intlMoreGender = this._data;
        if (intlMoreGender == null || (intlGender = intlMoreGender.newGender) == null) {
            intlGender = intlGender2;
        }
        if (!TEnum.equals(intlGender, intlGender2)) {
            intlGender2 = intlGender;
        }
        List<IntlGenderItem> listMo29164hb = uqb0.f180396b0.f170324a.mo29164hb(intlGender2);
        listMo29164hb.getClass();
        return listMo29164hb;
    }

    @Nullable
    /* JADX INFO: renamed from: h0 */
    public final SubGender m209159h0() {
        IntlMoreGender intlMoreGender = this._data;
        if (TextUtils.isEmpty(intlMoreGender != null ? intlMoreGender.subGender : null)) {
            return null;
        }
        IntlMoreGender intlMoreGender2 = this._data;
        return SubGender.get(intlMoreGender2 != null ? intlMoreGender2.subGender : null);
    }

    /* JADX INFO: renamed from: i0 */
    public final void m209160i0(@Nullable SubGender currentSubGender) {
        String string;
        IntlMoreGender intlMoreGender = this._data;
        if (intlMoreGender != null) {
            if (currentSubGender == null || (string = currentSubGender.toString()) == null) {
                string = "";
            }
            intlMoreGender.subGender = string;
        }
        Intent intent = new Intent();
        intent.putExtra("result_data", this._data);
        Act act = act();
        if (act != null) {
            act.setResult(-1, intent);
        }
    }

    /* JADX INFO: renamed from: j0 */
    public final void m209161j0(@Nullable IntlMoreGender data) {
        this._data = data;
        this.pageHelper = new l4g0("p_clone_gender_edit_add_more_detail", IntlAddGenderDetailsAct.class.getName());
    }

    @Override // p153l.k3m
    public void destroy() {
    }
}
