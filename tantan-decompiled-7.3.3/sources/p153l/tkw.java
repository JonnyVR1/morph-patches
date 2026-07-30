package p153l;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.annotation.DrawableRes;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes7.dex */
public class tkw {

    /* JADX INFO: renamed from: a */
    private int f174756a = bec0.f76366f;

    /* JADX INFO: renamed from: b */
    private int f174757b = xac0.f193014e;

    /* JADX INFO: renamed from: c */
    private WeakReference<Context> f174758c;

    /* JADX INFO: renamed from: d */
    private PopupWindow f174759d;

    /* JADX INFO: renamed from: e */
    private ListView f174760e;

    /* JADX INFO: renamed from: f */
    private ArrayList<rkw> f174761f;

    /* JADX INFO: renamed from: g */
    private skw f174762g;

    /* JADX INFO: renamed from: l.tkw$a */
    public class C20340a implements AdapterView.OnItemClickListener {
        public C20340a() {
        }

        @Override // android.widget.AdapterView.OnItemClickListener
        public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
            rkw rkwVar = (rkw) tkw.this.f174761f.get(i);
            if (rkwVar == null || tkw.this.f174762g == null) {
                return;
            }
            tkw.this.f174762g.mo18127a(view, rkwVar);
        }
    }

    public tkw(Context context) {
        this.f174758c = new WeakReference<>(context);
    }

    /* JADX INFO: renamed from: f */
    private void m191593f() {
        Context context = this.f174758c.get();
        ListView listView = new ListView(context);
        this.f174760e = listView;
        listView.setDivider(new ColorDrawable(context.getResources().getColor(w9c0.f187996b)));
        this.f174760e.setDividerHeight(1);
        this.f174760e.setSelector(w9c0.f188001g);
        PopupWindow popupWindow = new PopupWindow(this.f174760e, lpj0.m155247c(160.0f), -2);
        this.f174759d = popupWindow;
        popupWindow.setFocusable(true);
        this.f174759d.setOutsideTouchable(true);
        this.f174759d.setBackgroundDrawable(context.getResources().getDrawable(this.f174757b));
    }

    /* JADX INFO: renamed from: d */
    public tkw m191594d() {
        m191593f();
        return this;
    }

    /* JADX INFO: renamed from: e */
    public void m191595e() {
        if (this.f174759d.isShowing()) {
            this.f174759d.dismiss();
        }
    }

    /* JADX INFO: renamed from: g */
    public void m191596g(skw skwVar) {
        this.f174762g = skwVar;
    }

    /* JADX INFO: renamed from: h */
    public void m191597h(ArrayList<rkw> arrayList) {
        this.f174761f = arrayList;
    }

    /* JADX INFO: renamed from: i */
    public tkw m191598i(@DrawableRes int i) {
        this.f174757b = i;
        return this;
    }

    /* JADX INFO: renamed from: j */
    public void m191599j(View view) {
        ArrayList<rkw> arrayList;
        if (this.f174758c.get() == null || this.f174759d.isShowing() || (arrayList = this.f174761f) == null || arrayList.size() == 0) {
            return;
        }
        this.f174760e.setAdapter((ListAdapter) new C20341b(this.f174758c.get(), this.f174761f));
        this.f174760e.setOnItemClickListener(new C20340a());
        this.f174759d.showAsDropDown(view, 0, -40);
    }

    /* JADX INFO: renamed from: l.tkw$b */
    public class C20341b extends BaseAdapter {

        /* JADX INFO: renamed from: a */
        private Context f174764a;

        /* JADX INFO: renamed from: b */
        private ArrayList<rkw> f174765b;

        public C20341b(Context context, ArrayList<rkw> arrayList) {
            this.f174764a = context;
            this.f174765b = arrayList;
        }

        @Override // android.widget.Adapter
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public rkw getItem(int i) {
            return this.f174765b.get(i);
        }

        @Override // android.widget.Adapter
        public int getCount() {
            return this.f174765b.size();
        }

        @Override // android.widget.Adapter
        public long getItemId(int i) {
            return i;
        }

        @Override // android.widget.Adapter
        public View getView(int i, View view, ViewGroup viewGroup) {
            a aVar;
            if (view == null) {
                view = LayoutInflater.from(this.f174764a).inflate(tkw.this.f174756a, (ViewGroup) null);
                aVar = new a(this, null);
                aVar.f174767a = (ImageView) view.findViewById(pcc0.f151555i);
                aVar.f174768b = (TextView) view.findViewById(pcc0.f151556j);
                view.setTag(aVar);
            } else {
                aVar = (a) view.getTag();
            }
            rkw item = getItem(i);
            aVar.f174768b.setText(item.f163651a);
            hkw.m135646a().m135648c(item.f163652b, aVar.f174767a, 0);
            return view;
        }

        /* JADX INFO: renamed from: l.tkw$b$a */
        public class a {

            /* JADX INFO: renamed from: a */
            public ImageView f174767a;

            /* JADX INFO: renamed from: b */
            public TextView f174768b;

            private a() {
            }

            public /* synthetic */ a(C20341b c20341b, C20340a c20340a) {
                this();
            }
        }
    }
}
