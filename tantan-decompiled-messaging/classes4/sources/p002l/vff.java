package p002l;

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
import l.dac0;
import l.e30;
import l.f6c0;
import l.u4c0;
import l.vwb;
import l.x2c0;
import l.xdl0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class vff extends dac0<String> {

    /* JADX INFO: renamed from: c */
    public final Context f21104c;

    /* JADX INFO: renamed from: d */
    public ArrayList<String> f21105d = new ArrayList<>();

    /* JADX INFO: renamed from: e */
    public String f21106e;

    /* JADX INFO: renamed from: f */
    public Map<String, List<String>> f21107f;

    /* JADX INFO: renamed from: g */
    public e30<String> f21108g;

    public vff(Context context, e30<String> e30Var) {
        this.f21104c = context;
        this.f21108g = e30Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: H */
    public /* synthetic */ void m23935H(String str, View view) {
        this.f21108g.call(str);
    }

    /* JADX INFO: renamed from: C */
    public int m23937C() {
        return this.f21105d.size();
    }

    /* JADX INFO: renamed from: D */
    public View m23938D(ViewGroup viewGroup, int i) {
        return LayoutInflater.from(this.f21104c).inflate(f6c0.L2, viewGroup, false);
    }

    /* JADX INFO: renamed from: F, reason: merged with bridge method [inline-methods] */
    public void m23936A(View view, final String str, int i, int i2) {
        View viewFindViewById = view.findViewById(u4c0.t6);
        TextView textView = (TextView) view.findViewById(u4c0.ge);
        ImageView imageView = (ImageView) view.findViewById(u4c0.L);
        if (TextUtils.equals(str, this.f21106e)) {
            viewFindViewById.setBackgroundResource(x2c0.t1);
            imageView.setImageResource(x2c0.bp);
            xdl0.M(imageView, true);
        } else {
            viewFindViewById.setBackground(null);
            imageView.setImageResource(x2c0.ks);
            if (vwb.J(this.f21107f.get(str))) {
                xdl0.M(imageView, false);
            } else {
                xdl0.M(imageView, true);
            }
        }
        textView.setText(this.f21105d.get(i2));
        xdl0.E0(view, new View.OnClickListener() { // from class: l.uff
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.f20614a.m23935H(str, view2);
            }
        });
    }

    /* JADX INFO: renamed from: G, reason: merged with bridge method [inline-methods] */
    public String getItem(int i) {
        return this.f21105d.get(i);
    }

    /* JADX INFO: renamed from: I */
    public void m23941I(List<String> list, String str, Map<String, List<String>> map) {
        this.f21106e = str;
        this.f21107f = map;
        ArrayList arrayList = new ArrayList(list);
        if (arrayList.contains(str)) {
            arrayList.remove(str);
            arrayList.add(0, str);
        }
        this.f21105d.clear();
        this.f21105d.addAll(arrayList);
    }

    public long getItemId(int i) {
        return i;
    }
}
