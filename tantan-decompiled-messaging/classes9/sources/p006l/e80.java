package p006l;

import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p000p1.mobile.putong.app.PutongAct;
import com.p000p1.mobile.putong.core.R$string;
import com.p000p1.mobile.putong.core.p004ui.settings.SubsItemView;
import com.p1.mobile.putong.data.Contract;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.Date;
import l.dac0;
import l.f30;
import l.mqi0;
import l.o7r;
import l.vwb;
import l.xaj0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class e80 extends dac0<Contract> {

    /* JADX INFO: renamed from: c */
    public final ArrayList<Contract> f10837c = new ArrayList<>();

    /* JADX INFO: renamed from: d */
    public final PutongAct f10838d;

    /* JADX INFO: renamed from: e */
    public f30<View, Contract> f10839e;

    public e80(@NonNull PutongAct putongAct) {
        this.f10838d = putongAct;
    }

    /* JADX INFO: renamed from: C */
    public int m14406C() {
        return this.f10837c.size();
    }

    /* JADX INFO: renamed from: D */
    public View m14407D(ViewGroup viewGroup, int i) {
        return o7r.a(this.f10838d).inflate(f6c0.f12063Xe, viewGroup, false);
    }

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
    /* JADX INFO: renamed from: F, reason: merged with bridge method [inline-methods] */
    public void m14405A(View view, final Contract contract, int i, int i2) {
        SubsItemView subsItemView = (SubsItemView) view;
        subsItemView.m8412c(TextUtils.isEmpty(contract.id) ? new xaj0<>(this.f10838d.string(R$string.f2576ho), this.f10838d.string(R$string.f2606io), this.f10838d.string(R$string.f2636jo)) : new xaj0<>(contract.itemName, this.f10838d.getString(R$string.f2667ko, mqi0.d.format(new Date((long) contract.signTime))), this.f10838d.getString(R$string.f2545go)));
        subsItemView.f5650c.setOnClickListener(new View.OnClickListener() { // from class: l.d80
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.f10058a.m14410H(contract, view2);
            }
        });
    }

    @Nullable
    /* JADX INFO: renamed from: G, reason: merged with bridge method [inline-methods] */
    public Contract getItem(int i) {
        if (i > this.f10837c.size() - 1 || i < 0) {
            return null;
        }
        return this.f10837c.get(i);
    }

    /* JADX INFO: renamed from: H */
    public final /* synthetic */ void m14410H(Contract contract, View view) {
        if (NullChecker.a(this.f10839e)) {
            this.f10839e.call(view, contract);
        }
    }

    /* JADX INFO: renamed from: I */
    public void m14411I(ArrayList<Contract> arrayList) {
        this.f10837c.clear();
        if (!vwb.J(arrayList)) {
            this.f10837c.addAll(arrayList);
        }
        notifyDataSetChanged();
    }

    /* JADX INFO: renamed from: J */
    public void m14412J(f30<View, Contract> f30Var) {
        this.f10839e = f30Var;
    }
}
