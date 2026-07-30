package p149l;

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
public class vff extends dac0<String> {

    /* JADX INFO: renamed from: c */
    public final Context f181263c;

    /* JADX INFO: renamed from: d */
    public ArrayList<String> f181264d = new ArrayList<>();

    /* JADX INFO: renamed from: e */
    public String f181265e;

    /* JADX INFO: renamed from: f */
    public Map<String, List<String>> f181266f;

    /* JADX INFO: renamed from: g */
    public e30<String> f181267g;

    public vff(Context context, e30<String> e30Var) {
        this.f181263c = context;
        this.f181267g = e30Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: H */
    public /* synthetic */ void m198278H(String str, View view) {
        this.f181267g.call(str);
    }

    @Override // p149l.dac0
    /* JADX INFO: renamed from: C */
    public int mo28824C() {
        return this.f181264d.size();
    }

    @Override // p149l.dac0
    /* JADX INFO: renamed from: D */
    public View mo28825D(ViewGroup viewGroup, int i) {
        return LayoutInflater.from(this.f181263c).inflate(f6c0.f95445L2, viewGroup, false);
    }

    @Override // p149l.dac0
    /* JADX INFO: renamed from: F, reason: merged with bridge method [inline-methods] */
    public void mo28823A(View view, final String str, int i, int i2) {
        View viewFindViewById = view.findViewById(u4c0.f174480t6);
        TextView textView = (TextView) view.findViewById(u4c0.f174268ge);
        ImageView imageView = (ImageView) view.findViewById(u4c0.f173903L);
        if (TextUtils.equals(str, this.f181265e)) {
            viewFindViewById.setBackgroundResource(x2c0.f190572t1);
            imageView.setImageResource(x2c0.f190023bp);
            xdl0.m208344M(imageView, true);
        } else {
            viewFindViewById.setBackground(null);
            imageView.setImageResource(x2c0.f190311ks);
            if (vwb.m200296J(this.f181266f.get(str))) {
                xdl0.m208344M(imageView, false);
            } else {
                xdl0.m208344M(imageView, true);
            }
        }
        textView.setText(this.f181264d.get(i2));
        xdl0.m208329E0(view, new View.OnClickListener() { // from class: l.uff
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.f176253a.m198278H(str, view2);
            }
        });
    }

    @Override // p149l.dac0
    /* JADX INFO: renamed from: G, reason: merged with bridge method [inline-methods] */
    public String getItem(int i) {
        return this.f181264d.get(i);
    }

    /* JADX INFO: renamed from: I */
    public void m198281I(List<String> list, String str, Map<String, List<String>> map) {
        this.f181265e = str;
        this.f181266f = map;
        ArrayList arrayList = new ArrayList(list);
        if (arrayList.contains(str)) {
            arrayList.remove(str);
            arrayList.add(0, str);
        }
        this.f181264d.clear();
        this.f181264d.addAll(arrayList);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public long getItemId(int i) {
        return i;
    }
}
