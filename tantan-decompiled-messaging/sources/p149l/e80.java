package p149l;

import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p046p1.mobile.putong.app.PutongAct;
import com.p046p1.mobile.putong.core.R$string;
import com.p046p1.mobile.putong.core.p053ui.settings.SubsItemView;
import com.p046p1.mobile.putong.data.Contract;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.Date;

/* JADX INFO: loaded from: classes9.dex */
public class e80 extends dac0<Contract> {

    /* JADX INFO: renamed from: c */
    public final ArrayList<Contract> f89779c = new ArrayList<>();

    /* JADX INFO: renamed from: d */
    public final PutongAct f89780d;

    /* JADX INFO: renamed from: e */
    public f30<View, Contract> f89781e;

    public e80(@NonNull PutongAct putongAct) {
        this.f89780d = putongAct;
    }

    @Override // p149l.dac0
    /* JADX INFO: renamed from: C */
    public int getPageCount() {
        return this.f89779c.size();
    }

    @Override // p149l.dac0
    /* JADX INFO: renamed from: D */
    public View mo28825D(ViewGroup viewGroup, int i) {
        return o7r.m163037a(this.f89780d).inflate(f6c0.f95649Xe, viewGroup, false);
    }

    @Override // p149l.dac0
    /* JADX INFO: renamed from: F, reason: merged with bridge method [inline-methods] */
    public void mo28823A(View view, final Contract contract, int i, int i2) {
        SubsItemView subsItemView = (SubsItemView) view;
        subsItemView.m55045c(TextUtils.isEmpty(contract.f38735id) ? new xaj0<>(this.f89780d.string(R$string.f18587ho), this.f89780d.string(R$string.f18617io), this.f89780d.string(R$string.f18647jo)) : new xaj0<>(contract.itemName, this.f89780d.getString(R$string.f18678ko, mqi0.f135252d.format(new Date((long) contract.signTime))), this.f89780d.getString(R$string.f18556go)));
        subsItemView.f35869c.setOnClickListener(new View.OnClickListener() { // from class: l.d80
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.f84807a.m115234H(contract, view2);
            }
        });
    }

    @Override // p149l.dac0
    @Nullable
    /* JADX INFO: renamed from: G, reason: merged with bridge method [inline-methods] */
    public Contract getItem(int i) {
        if (i > this.f89779c.size() - 1 || i < 0) {
            return null;
        }
        return this.f89779c.get(i);
    }

    /* JADX INFO: renamed from: H */
    public final /* synthetic */ void m115234H(Contract contract, View view) {
        if (NullChecker.m81303a(this.f89781e)) {
            this.f89781e.call(view, contract);
        }
    }

    /* JADX INFO: renamed from: I */
    public void m115235I(ArrayList<Contract> arrayList) {
        this.f89779c.clear();
        if (!vwb.m200296J(arrayList)) {
            this.f89779c.addAll(arrayList);
        }
        notifyDataSetChanged();
    }

    /* JADX INFO: renamed from: J */
    public void m115236J(f30<View, Contract> f30Var) {
        this.f89781e = f30Var;
    }
}
