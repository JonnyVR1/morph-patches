package p009l;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.android.app.App;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.data.FateRadarSearchConditions;
import com.p1.mobile.putong.core.data.FilterConditionsCustomItems;
import com.p1.mobile.putong.core.data.FilterConditionsStatusItem;
import com.p1.mobile.putong.core.data.NewTags;
import com.p1.mobile.putong.core.ui.VText_Bold;
import com.p1.mobile.putong.data.Extensions;
import com.p1.mobile.putong.data.Interest;
import com.p1.mobile.putong.data.Profile;
import java.util.ArrayList;
import java.util.List;
import l.d30;
import l.f6c0;
import l.s7m;
import l.sa40;
import l.u4c0;
import l.upa;
import l.vwb;
import l.w0c0;
import l.x2c0;
import l.xdl0;
import l.xdw;
import v.VProgressBar;
import v.VText;
import v.navigationbar.VNavigationBar;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class wdw implements s7m<vdw> {

    /* JADX INFO: renamed from: l */
    public static final String[] f22034l = {"对方状态（多选）", "你在意的特质（多选）", "兴趣爱好（多选）"};

    /* JADX INFO: renamed from: a */
    public VNavigationBar f22035a;

    /* JADX INFO: renamed from: b */
    public ViewPager2 f22036b;

    /* JADX INFO: renamed from: c */
    public VText f22037c;

    /* JADX INFO: renamed from: d */
    public VProgressBar f22038d;

    /* JADX INFO: renamed from: e */
    public final Act f22039e;

    /* JADX INFO: renamed from: f */
    public vdw f22040f;

    /* JADX INFO: renamed from: g */
    public C1289d f22041g;

    /* JADX INFO: renamed from: h */
    public List<NewTags> f22042h;

    /* JADX INFO: renamed from: i */
    public String f22043i;

    /* JADX INFO: renamed from: j */
    public FilterConditionsCustomItems f22044j;

    /* JADX INFO: renamed from: k */
    public FateRadarSearchConditions f22045k;

    /* JADX INFO: renamed from: l.wdw$a */
    public class ViewOnClickListenerC1286a implements View.OnClickListener {

        /* JADX INFO: renamed from: l.wdw$a$a */
        public class a implements d30 {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ int f22047a;

            public a(int i) {
                this.f22047a = i;
            }

            public void call() {
                int i = this.f22047a;
                if (i == 0) {
                    int size = wdw.this.f22042h.size();
                    ViewOnClickListenerC1286a viewOnClickListenerC1286a = ViewOnClickListenerC1286a.this;
                    if (size > 0) {
                        wdw.this.f22037c.setText("下一步");
                    } else {
                        wdw.this.f22037c.setText("完成");
                    }
                    wdw.this.f22036b.setCurrentItem(this.f22047a + 1);
                    return;
                }
                if (i != 1) {
                    if (i == 2) {
                        wdw.this.f22039e.finish();
                    }
                } else {
                    int size2 = wdw.this.f22042h.size();
                    ViewOnClickListenerC1286a viewOnClickListenerC1286a2 = ViewOnClickListenerC1286a.this;
                    if (size2 > 0) {
                        wdw.this.f22036b.setCurrentItem(this.f22047a + 1);
                    } else {
                        wdw.this.f22039e.finish();
                    }
                    wdw.this.f22037c.setText("完成");
                }
            }
        }

        public ViewOnClickListenerC1286a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            int currentItem = wdw.this.f22036b.getCurrentItem();
            wdw wdwVar = wdw.this;
            wdwVar.f22045k.customItems = wdwVar.f22041g.m24123y();
            wdw.this.f22040f.m23370i0(wdw.this.f22045k, new a(currentItem));
        }
    }

    /* JADX INFO: renamed from: l.wdw$b */
    public static class C1287b extends RecyclerView.Adapter<C1288c> {

        /* JADX INFO: renamed from: a */
        public List<FilterConditionsStatusItem> f22049a;

        /* JADX INFO: renamed from: b */
        public d30 f22050b;

        /* JADX INFO: renamed from: l.wdw$b$a */
        public class a implements View.OnClickListener {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ FilterConditionsStatusItem f22051a;

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ C1288c f22052b;

            public a(FilterConditionsStatusItem filterConditionsStatusItem, C1288c c1288c) {
                this.f22051a = filterConditionsStatusItem;
                this.f22052b = c1288c;
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                FilterConditionsStatusItem filterConditionsStatusItem = this.f22051a;
                boolean z = filterConditionsStatusItem.selected;
                filterConditionsStatusItem.selected = !z;
                C1288c c1288c = this.f22052b;
                if (z) {
                    c1288c.f22054a.setTextColor(App.e.getResources().getColor(w0c0.p0));
                    this.f22052b.f22054a.setBackgroundDrawable(App.e.getResources().getDrawable(x2c0.T0));
                } else {
                    c1288c.f22054a.setTextColor(App.e.getResources().getColor(w0c0.b2));
                    this.f22052b.f22054a.setBackgroundDrawable(App.e.getResources().getDrawable(x2c0.t));
                }
                d30 d30Var = C1287b.this.f22050b;
                if (d30Var != null) {
                    d30Var.call();
                }
            }
        }

        public C1287b(List<FilterConditionsStatusItem> list) {
            this.f22049a = list;
        }

        @NonNull
        /* JADX INFO: renamed from: A, reason: merged with bridge method [inline-methods] */
        public C1288c onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
            return i == 0 ? new C1288c(LayoutInflater.from(viewGroup.getContext()).inflate(f6c0.G6, viewGroup, false)) : new C1288c(LayoutInflater.from(viewGroup.getContext()).inflate(f6c0.H6, viewGroup, false));
        }

        /* JADX INFO: renamed from: C */
        public void m24117C(d30 d30Var) {
            this.f22050b = d30Var;
        }

        public int getItemCount() {
            List<FilterConditionsStatusItem> list = this.f22049a;
            if (list == null) {
                return 0;
            }
            return list.size();
        }

        public int getItemViewType(int i) {
            return i < getItemCount() - 1 ? 0 : 1;
        }

        /* JADX INFO: renamed from: y */
        public List<FilterConditionsStatusItem> m24118y() {
            return this.f22049a;
        }

        /* JADX INFO: renamed from: z, reason: merged with bridge method [inline-methods] */
        public void onBindViewHolder(@NonNull C1288c c1288c, int i) {
            FilterConditionsStatusItem filterConditionsStatusItem = this.f22049a.get(i);
            c1288c.f22054a.setText(filterConditionsStatusItem.value);
            boolean z = filterConditionsStatusItem.selected;
            VText_Bold vText_Bold = c1288c.f22054a;
            if (z) {
                vText_Bold.setTextColor(App.e.getResources().getColor(w0c0.b2));
                c1288c.f22054a.setBackgroundDrawable(App.e.getResources().getDrawable(x2c0.t));
            } else {
                vText_Bold.setTextColor(App.e.getResources().getColor(w0c0.p0));
                c1288c.f22054a.setBackgroundDrawable(App.e.getResources().getDrawable(x2c0.T0));
            }
            xdl0.E0(c1288c.f22054a, new a(filterConditionsStatusItem, c1288c));
        }
    }

    /* JADX INFO: renamed from: l.wdw$c */
    public static class C1288c extends RecyclerView.d0 {

        /* JADX INFO: renamed from: a */
        public VText_Bold f22054a;

        public C1288c(@NonNull View view) {
            super(view);
            this.f22054a = view.findViewById(u4c0.w6);
        }
    }

    /* JADX INFO: renamed from: l.wdw$d */
    public static class C1289d extends RecyclerView.Adapter<C1290e> {

        /* JADX INFO: renamed from: a */
        public String f22055a;

        /* JADX INFO: renamed from: b */
        public FilterConditionsCustomItems f22056b;

        /* JADX INFO: renamed from: c */
        public List<NewTags> f22057c;

        /* JADX INFO: renamed from: l.wdw$d$a */
        public class a implements d30 {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ C1287b f22058a;

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ int f22059b;

            public a(C1287b c1287b, int i) {
                this.f22058a = c1287b;
                this.f22059b = i;
            }

            public void call() {
                C1289d.this.m24122D(this.f22059b, this.f22058a.m24118y());
            }
        }

        public C1289d(String str, FilterConditionsCustomItems filterConditionsCustomItems, List<NewTags> list) {
            this.f22055a = str;
            this.f22056b = filterConditionsCustomItems;
            this.f22057c = list;
        }

        /* JADX INFO: renamed from: A, reason: merged with bridge method [inline-methods] */
        public void onBindViewHolder(@NonNull C1290e c1290e, int i) {
            c1290e.f22061a.setText(wdw.f22034l[i]);
            C1287b c1287b = new C1287b(m24124z(i));
            c1290e.f22062b.setLayoutManager(new LinearLayoutManager(((RecyclerView.d0) c1290e).itemView.getContext()));
            c1290e.f22062b.setAdapter(c1287b);
            c1287b.m24117C(new a(c1287b, i));
        }

        @NonNull
        /* JADX INFO: renamed from: C, reason: merged with bridge method [inline-methods] */
        public C1290e onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
            return new C1290e(LayoutInflater.from(viewGroup.getContext()).inflate(f6c0.I6, viewGroup, false));
        }

        /* JADX INFO: renamed from: D */
        public void m24122D(int i, List<FilterConditionsStatusItem> list) {
            if (i == 0) {
                this.f22056b.status = list;
                return;
            }
            if (i == 1) {
                this.f22056b.feature = list;
                return;
            }
            if (i == 2) {
                ArrayList arrayList = new ArrayList();
                for (FilterConditionsStatusItem filterConditionsStatusItem : list) {
                    if (filterConditionsStatusItem.selected) {
                        arrayList.add(String.valueOf(filterConditionsStatusItem.id));
                    }
                }
                this.f22056b.selectedInterest = arrayList;
            }
        }

        public int getItemCount() {
            return wdw.f22034l.length;
        }

        /* JADX INFO: renamed from: y */
        public FilterConditionsCustomItems m24123y() {
            return this.f22056b;
        }

        /* JADX INFO: renamed from: z */
        public List<FilterConditionsStatusItem> m24124z(int i) {
            ArrayList arrayList = new ArrayList();
            if (i == 0) {
                return this.f22056b.status;
            }
            if (i == 1) {
                return this.f22056b.feature;
            }
            if (i == 2) {
                for (NewTags newTags : this.f22057c) {
                    FilterConditionsStatusItem filterConditionsStatusItemNew_ = FilterConditionsStatusItem.new_();
                    filterConditionsStatusItemNew_.id = Integer.valueOf(newTags.id).intValue();
                    filterConditionsStatusItemNew_.value = newTags.name;
                    filterConditionsStatusItemNew_.selected = this.f22056b.selectedInterest.contains(newTags.id);
                    arrayList.add(filterConditionsStatusItemNew_);
                }
            }
            return arrayList;
        }
    }

    /* JADX INFO: renamed from: l.wdw$e */
    public static class C1290e extends RecyclerView.d0 {

        /* JADX INFO: renamed from: a */
        public VText_Bold f22061a;

        /* JADX INFO: renamed from: b */
        public RecyclerView f22062b;

        public C1290e(@NonNull View view) {
            super(view);
            this.f22061a = view.findViewById(u4c0.ge);
            this.f22062b = view.findViewById(u4c0.pb);
        }
    }

    public wdw(Act act) {
        this.f22039e = act;
    }

    /* JADX INFO: renamed from: e */
    public static List<NewTags> m24110e() {
        Extensions extensions;
        Interest interest;
        if (upa.L3()) {
            return new ArrayList();
        }
        Profile profile = CoreModule.c.e0.p9().profile;
        if (profile == null || (extensions = profile.extensions) == null || (interest = extensions.interest) == null || vwb.J(interest.tags)) {
            return new ArrayList();
        }
        List<NewTags> listB = sa40.o().P(CoreModule.c.e0.p9().profile.extensions.interest.tags).b();
        return listB.size() > 20 ? listB.subList(0, 20) : listB;
    }

    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context m24111C0() {
        return this.f22039e;
    }

    /* JADX INFO: renamed from: c */
    public View m24112c(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return xdw.b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public void m24115i1(vdw vdwVar) {
        this.f22040f = vdwVar;
    }

    /* JADX INFO: renamed from: f */
    public void m24114f(Bundle bundle) {
        this.f22035a.setLeftIconAsBack(this.f22039e);
        this.f22036b.setUserInputEnabled(false);
        Intent intent = act().getIntent();
        if (intent == null) {
            return;
        }
        this.f22043i = intent.getStringExtra("targetPage");
        FateRadarSearchConditions serializableExtra = intent.getSerializableExtra("data_key");
        this.f22045k = serializableExtra;
        if (serializableExtra == null) {
            this.f22039e.finish();
            return;
        }
        this.f22044j = serializableExtra.customItems;
        List<NewTags> listM24110e = m24110e();
        this.f22042h = listM24110e;
        C1289d c1289d = new C1289d(this.f22043i, this.f22044j, listM24110e);
        this.f22041g = c1289d;
        this.f22036b.setAdapter(c1289d);
        if (TextUtils.equals(this.f22043i, "select_status")) {
            this.f22036b.j(0, false);
            this.f22037c.setText("下一步");
        } else if (TextUtils.equals(this.f22043i, "select_feature")) {
            this.f22036b.j(1, false);
            int size = this.f22042h.size();
            VText vText = this.f22037c;
            if (size > 0) {
                vText.setText("下一步");
            } else {
                vText.setText("完成");
            }
        } else if (TextUtils.equals(this.f22043i, "select_selectedInterest")) {
            this.f22036b.j(2, false);
            this.f22037c.setText("完成");
        }
        xdl0.E0(this.f22037c, new ViewOnClickListenerC1286a());
    }

    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return m24112c(layoutInflater, viewGroup);
    }

    public void destroy() {
    }
}
