package p153l;

import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public class bhf extends jic0<String> {

    /* JADX INFO: renamed from: c */
    public final Context f76775c;

    /* JADX INFO: renamed from: d */
    public ArrayList<String> f76776d = new ArrayList<>();

    /* JADX INFO: renamed from: e */
    public String f76777e;

    /* JADX INFO: renamed from: f */
    public Map<String, List<String>> f76778f;

    /* JADX INFO: renamed from: g */
    public y20<String> f76779g;

    public bhf(Context context, y20<String> y20Var) {
        this.f76775c = context;
        this.f76779g = y20Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: H */
    public /* synthetic */ void m104336H(String str, View view) {
        this.f76779g.call(str);
    }

    @Override // p153l.jic0
    /* JADX INFO: renamed from: C */
    public int mo29823C() {
        return this.f76776d.size();
    }

    @Override // p153l.jic0
    /* JADX INFO: renamed from: D */
    public View mo29824D(ViewGroup viewGroup, int i) {
        return LayoutInflater.from(this.f76775c).inflate(kec0.f125499L2, viewGroup, false);
    }

    @Override // p153l.jic0
    /* JADX INFO: renamed from: F, reason: merged with bridge method [inline-methods] */
    public void mo29822A(View view, final String str, int i, int i2) {
        View viewFindViewById = view.findViewById(adc0.f70605v6);
        TextView textView = (TextView) view.findViewById(adc0.f70409je);
        ImageView imageView = (ImageView) view.findViewById(adc0.f69991L);
        if (TextUtils.equals(str, this.f76777e)) {
            viewFindViewById.setBackgroundResource(dbc0.f87467u1);
            imageView.setImageResource(dbc0.f86482Pp);
            bnl0.m105524M(imageView, true);
        } else {
            viewFindViewById.setBackground(null);
            imageView.setImageResource(dbc0.f86773Ys);
            if (jyb.m147479J(this.f76778f.get(str))) {
                bnl0.m105524M(imageView, false);
            } else {
                bnl0.m105524M(imageView, true);
            }
        }
        textView.setText(this.f76776d.get(i2));
        bnl0.m105509E0(view, new View.OnClickListener() { // from class: l.ahf
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.f71353a.m104336H(str, view2);
            }
        });
    }

    @Override // p153l.jic0
    /* JADX INFO: renamed from: G, reason: merged with bridge method [inline-methods] */
    public String getItem(int i) {
        return this.f76776d.get(i);
    }

    /* JADX INFO: renamed from: I */
    public void m104339I(List<String> list, String str, Map<String, List<String>> map) {
        this.f76777e = str;
        this.f76778f = map;
        ArrayList arrayList = new ArrayList(list);
        if (arrayList.contains(str)) {
            arrayList.remove(str);
            arrayList.add(0, str);
        }
        this.f76776d.clear();
        this.f76776d.addAll(arrayList);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public long getItemId(int i) {
        return i;
    }
}
