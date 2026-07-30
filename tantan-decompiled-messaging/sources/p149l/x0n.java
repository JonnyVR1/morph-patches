package p149l;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.android.app.C4319c;
import com.p046p1.mobile.putong.core.p053ui.settings.intlGender.IntlAddGenderDetailsAct;
import com.p046p1.mobile.putong.data.IntlGender;
import com.p046p1.mobile.putong.data.IntlGenderItem;
import com.p046p1.mobile.putong.data.IntlMoreGender;
import com.p046p1.mobile.putong.data.SubGender;
import com.p046p1.mobile.putong.data.tenum.TEnum;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m87231d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00072\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u000e\u0010\tJ\u0013\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0014\u001a\u0004\u0018\u00010\u0013¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0017\u001a\u00020\u00072\b\u0010\u0016\u001a\u0004\u0018\u00010\u0013¢\u0006\u0004\b\u0017\u0010\u0018R$\u0010 \u001a\u0004\u0018\u00010\u00198\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\u0018\u0010#\u001a\u0004\u0018\u00010\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u0010\"¨\u0006$"}, m87232d2 = {"Ll/x0n;", "Ll/jq2;", "Ll/b1n;", "Ll/mcr;", "lifecycleProvider", "<init>", "(Ll/mcr;)V", "", "destroy", "()V", "Lcom/p1/mobile/putong/data/IntlMoreGender;", "data", "j0", "(Lcom/p1/mobile/putong/data/IntlMoreGender;)V", "a0", "", "Lcom/p1/mobile/putong/data/IntlGenderItem;", "g0", "()Ljava/util/List;", "Lcom/p1/mobile/putong/data/SubGender;", "h0", "()Lcom/p1/mobile/putong/data/SubGender;", "currentSubGender", "i0", "(Lcom/p1/mobile/putong/data/SubGender;)V", "Ll/cwf0;", "a", "Ll/cwf0;", "getPageHelper", "()Ll/cwf0;", "setPageHelper", "(Ll/cwf0;)V", "pageHelper", "b", "Lcom/p1/mobile/putong/data/IntlMoreGender;", "_data", "b_core_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
public final class x0n extends jq2<b1n> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @Nullable
    public cwf0 pageHelper;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @Nullable
    public IntlMoreGender _data;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x0n(@NotNull mcr mcrVar) {
        super(mcrVar);
        mcrVar.getClass();
    }

    /* JADX INFO: renamed from: e0 */
    public static void m206635e0(x0n x0nVar, Bundle bundle) {
        V v2 = x0nVar.viewModel;
        v2.getClass();
        ((b1n) v2).m99866r();
    }

    /* JADX INFO: renamed from: f0 */
    public static void m206636f0(x0n x0nVar, C4319c c4319c) {
        c4319c.getClass();
        if (c4319c == C4319c.f15545f) {
            cwf0 cwf0Var = x0nVar.pageHelper;
            cwf0Var.getClass();
            cwf0Var.m109033i();
            return;
        }
        if (c4319c == C4319c.f15548i) {
            cwf0 cwf0Var2 = x0nVar.pageHelper;
            cwf0Var2.getClass();
            cwf0Var2.m109036l();
        } else if (c4319c == C4319c.f15549j) {
            cwf0 cwf0Var3 = x0nVar.pageHelper;
            cwf0Var3.getClass();
            cwf0Var3.m109035k();
        } else if (c4319c == C4319c.f15552m) {
            cwf0 cwf0Var4 = x0nVar.pageHelper;
            cwf0Var4.getClass();
            cwf0Var4.m109034j();
        }
    }

    @Override // p149l.jq2
    /* JADX INFO: renamed from: a0 */
    public void mo39470a0() {
        creates(new e30() { // from class: l.v0n
            @Override // p149l.e30
            public final void call(Object obj) {
                x0n.m206635e0(this.f179126a, (Bundle) obj);
            }
        });
        lifecycle().subscribe(mkd0.m154955G(new e30() { // from class: l.w0n
            @Override // p149l.e30
            public final void call(Object obj) {
                x0n.m206636f0(this.f183927a, (C4319c) obj);
            }
        }));
    }

    @NotNull
    /* JADX INFO: renamed from: g0 */
    public final List<IntlGenderItem> m206637g0() {
        IntlGender intlGender;
        IntlGender intlGender2 = IntlGender.get("unknown_");
        IntlMoreGender intlMoreGender = this._data;
        if (intlMoreGender == null || (intlGender = intlMoreGender.newGender) == null) {
            intlGender = intlGender2;
        }
        if (!TEnum.equals(intlGender, intlGender2)) {
            intlGender2 = intlGender;
        }
        List<IntlGenderItem> listMo28165hb = qib0.f154713b0.f139230a.mo28165hb(intlGender2);
        listMo28165hb.getClass();
        return listMo28165hb;
    }

    @Nullable
    /* JADX INFO: renamed from: h0 */
    public final SubGender m206638h0() {
        IntlMoreGender intlMoreGender = this._data;
        if (TextUtils.isEmpty(intlMoreGender != null ? intlMoreGender.subGender : null)) {
            return null;
        }
        IntlMoreGender intlMoreGender2 = this._data;
        return SubGender.get(intlMoreGender2 != null ? intlMoreGender2.subGender : null);
    }

    /* JADX INFO: renamed from: i0 */
    public final void m206639i0(@Nullable SubGender currentSubGender) {
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
    public final void m206640j0(@Nullable IntlMoreGender data) {
        this._data = data;
        this.pageHelper = new cwf0("p_clone_gender_edit_add_more_detail", IntlAddGenderDetailsAct.class.getName());
    }

    @Override // p149l.q0m
    public void destroy() {
    }
}
