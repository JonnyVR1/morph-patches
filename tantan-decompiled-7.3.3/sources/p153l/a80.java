package p153l;

import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p051p1.mobile.putong.app.PutongAct;
import com.p051p1.mobile.putong.core.R$string;
import com.p051p1.mobile.putong.core.p058ui.settings.SubsItemView;
import com.p051p1.mobile.putong.data.Contract;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.Date;

/* JADX INFO: loaded from: classes12.dex */
public class a80 extends jic0<Contract> {

    /* JADX INFO: renamed from: c */
    public final ArrayList<Contract> f68873c = new ArrayList<>();

    /* JADX INFO: renamed from: d */
    public final PutongAct f68874d;

    /* JADX INFO: renamed from: e */
    public z20<View, Contract> f68875e;

    public a80(@NonNull PutongAct putongAct) {
        this.f68874d = putongAct;
    }

    @Override // p153l.jic0
    /* JADX INFO: renamed from: C */
    public int getPageCount() {
        return this.f68873c.size();
    }

    @Override // p153l.jic0
    /* JADX INFO: renamed from: D */
    public View mo29824D(ViewGroup viewGroup, int i) {
        return p9r.m171370a(this.f68874d).inflate(kec0.f125820ef, viewGroup, false);
    }

    @Override // p153l.jic0
    /* JADX INFO: renamed from: F, reason: merged with bridge method [inline-methods] */
    public void mo29822A(View view, final Contract contract, int i, int i2) {
        SubsItemView subsItemView = (SubsItemView) view;
        subsItemView.m56228c(TextUtils.isEmpty(contract.f39583id) ? new bkj0<>(this.f68874d.string(R$string.f18403Do), this.f68874d.string(R$string.f18434Eo), this.f68874d.string(R$string.f18465Fo)) : new bkj0<>(contract.itemName, this.f68874d.getString(R$string.f18496Go, pzi0.f154857d.format(new Date((long) contract.signTime))), this.f68874d.getString(R$string.f18372Co)));
        subsItemView.f36717c.setOnClickListener(new View.OnClickListener() { // from class: l.z70
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.f203209a.m96410H(contract, view2);
            }
        });
    }

    @Override // p153l.jic0
    @Nullable
    /* JADX INFO: renamed from: G, reason: merged with bridge method [inline-methods] */
    public Contract getItem(int i) {
        if (i > this.f68873c.size() - 1 || i < 0) {
            return null;
        }
        return this.f68873c.get(i);
    }

    /* JADX INFO: renamed from: H */
    public final /* synthetic */ void m96410H(Contract contract, View view) {
        if (NullChecker.m82486a(this.f68875e)) {
            this.f68875e.call(view, contract);
        }
    }

    /* JADX INFO: renamed from: I */
    public void m96411I(ArrayList<Contract> arrayList) {
        this.f68873c.clear();
        if (!jyb.m147479J(arrayList)) {
            this.f68873c.addAll(arrayList);
        }
        notifyDataSetChanged();
    }

    /* JADX INFO: renamed from: J */
    public void m96412J(z20<View, Contract> z20Var) {
        this.f68875e = z20Var;
    }
}
