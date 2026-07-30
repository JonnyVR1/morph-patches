package p149l;

import android.content.Context;
import android.database.ContentObserver;
import android.database.Cursor;
import android.database.DataSetObserver;
import android.os.Handler;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Filter;
import android.widget.Filterable;
import androidx.annotation.RestrictTo;

/* JADX INFO: loaded from: classes.dex */
public abstract class gxb extends BaseAdapter implements Filterable, hxb.InterfaceC17425a {

    /* JADX INFO: renamed from: a */
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public boolean f104852a;

    /* JADX INFO: renamed from: b */
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public boolean f104853b;

    /* JADX INFO: renamed from: c */
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public Cursor f104854c;

    /* JADX INFO: renamed from: d */
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public Context f104855d;

    /* JADX INFO: renamed from: e */
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public int f104856e;

    /* JADX INFO: renamed from: f */
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public C17189a f104857f;

    /* JADX INFO: renamed from: g */
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public DataSetObserver f104858g;

    /* JADX INFO: renamed from: h */
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public hxb f104859h;

    /* JADX INFO: renamed from: l.gxb$a */
    public class C17189a extends ContentObserver {
        public C17189a() {
            super(new Handler());
        }

        @Override // android.database.ContentObserver
        public boolean deliverSelfNotifications() {
            return true;
        }

        @Override // android.database.ContentObserver
        public void onChange(boolean z) {
            gxb.this.m128540h();
        }
    }

    /* JADX INFO: renamed from: l.gxb$b */
    public class C17190b extends DataSetObserver {
        public C17190b() {
        }

        @Override // android.database.DataSetObserver
        public void onChanged() {
            gxb gxbVar = gxb.this;
            gxbVar.f104852a = true;
            gxbVar.notifyDataSetChanged();
        }

        @Override // android.database.DataSetObserver
        public void onInvalidated() {
            gxb gxbVar = gxb.this;
            gxbVar.f104852a = false;
            gxbVar.notifyDataSetInvalidated();
        }
    }

    public gxb(Context context, Cursor cursor, boolean z) {
        m128538e(context, cursor, z ? 1 : 2);
    }

    /* JADX INFO: renamed from: a */
    public void mo123281a(Cursor cursor) {
        Cursor cursorM128541i = m128541i(cursor);
        if (cursorM128541i != null) {
            cursorM128541i.close();
        }
    }

    @Override // p149l.hxb.InterfaceC17425a
    /* JADX INFO: renamed from: b */
    public Cursor mo128537b() {
        return this.f104854c;
    }

    public abstract CharSequence convertToString(Cursor cursor);

    /* JADX INFO: renamed from: d */
    public abstract void mo123283d(View view, Context context, Cursor cursor);

    /* JADX INFO: renamed from: e */
    public void m128538e(Context context, Cursor cursor, int i) {
        if ((i & 1) == 1) {
            i |= 2;
            this.f104853b = true;
        } else {
            this.f104853b = false;
        }
        boolean z = cursor != null;
        this.f104854c = cursor;
        this.f104852a = z;
        this.f104855d = context;
        this.f104856e = z ? cursor.getColumnIndexOrThrow("_id") : -1;
        if ((i & 2) == 2) {
            this.f104857f = new C17189a();
            this.f104858g = new C17190b();
        } else {
            this.f104857f = null;
            this.f104858g = null;
        }
        if (z) {
            C17189a c17189a = this.f104857f;
            if (c17189a != null) {
                cursor.registerContentObserver(c17189a);
            }
            DataSetObserver dataSetObserver = this.f104858g;
            if (dataSetObserver != null) {
                cursor.registerDataSetObserver(dataSetObserver);
            }
        }
    }

    /* JADX INFO: renamed from: f */
    public abstract View mo128539f(Context context, Cursor cursor, ViewGroup viewGroup);

    /* JADX INFO: renamed from: g */
    public abstract View mo123284g(Context context, Cursor cursor, ViewGroup viewGroup);

    @Override // android.widget.Adapter
    public int getCount() {
        Cursor cursor;
        if (!this.f104852a || (cursor = this.f104854c) == null) {
            return 0;
        }
        return cursor.getCount();
    }

    @Override // android.widget.BaseAdapter, android.widget.SpinnerAdapter
    public View getDropDownView(int i, View view, ViewGroup viewGroup) {
        if (!this.f104852a) {
            return null;
        }
        this.f104854c.moveToPosition(i);
        if (view == null) {
            view = mo128539f(this.f104855d, this.f104854c, viewGroup);
        }
        mo123283d(view, this.f104855d, this.f104854c);
        return view;
    }

    @Override // android.widget.Filterable
    public Filter getFilter() {
        if (this.f104859h == null) {
            this.f104859h = new hxb(this);
        }
        return this.f104859h;
    }

    @Override // android.widget.Adapter
    public Object getItem(int i) {
        Cursor cursor;
        if (!this.f104852a || (cursor = this.f104854c) == null) {
            return null;
        }
        cursor.moveToPosition(i);
        return this.f104854c;
    }

    @Override // android.widget.Adapter
    public long getItemId(int i) {
        Cursor cursor;
        if (this.f104852a && (cursor = this.f104854c) != null && cursor.moveToPosition(i)) {
            return this.f104854c.getLong(this.f104856e);
        }
        return 0L;
    }

    @Override // android.widget.Adapter
    public View getView(int i, View view, ViewGroup viewGroup) {
        if (!this.f104852a) {
            qkq0.m175383a("this should only be called when the cursor is valid");
            return null;
        }
        if (!this.f104854c.moveToPosition(i)) {
            f3c.m119257a("couldn't move cursor to position ", i);
            return null;
        }
        if (view == null) {
            view = mo123284g(this.f104855d, this.f104854c, viewGroup);
        }
        mo123283d(view, this.f104855d, this.f104854c);
        return view;
    }

    /* JADX INFO: renamed from: h */
    public void m128540h() {
        Cursor cursor;
        if (!this.f104853b || (cursor = this.f104854c) == null || cursor.isClosed()) {
            return;
        }
        this.f104852a = this.f104854c.requery();
    }

    /* JADX INFO: renamed from: i */
    public Cursor m128541i(Cursor cursor) {
        Cursor cursor2 = this.f104854c;
        if (cursor == cursor2) {
            return null;
        }
        if (cursor2 != null) {
            C17189a c17189a = this.f104857f;
            if (c17189a != null) {
                cursor2.unregisterContentObserver(c17189a);
            }
            DataSetObserver dataSetObserver = this.f104858g;
            if (dataSetObserver != null) {
                cursor2.unregisterDataSetObserver(dataSetObserver);
            }
        }
        this.f104854c = cursor;
        if (cursor == null) {
            this.f104856e = -1;
            this.f104852a = false;
            notifyDataSetInvalidated();
            return cursor2;
        }
        C17189a c17189a2 = this.f104857f;
        if (c17189a2 != null) {
            cursor.registerContentObserver(c17189a2);
        }
        DataSetObserver dataSetObserver2 = this.f104858g;
        if (dataSetObserver2 != null) {
            cursor.registerDataSetObserver(dataSetObserver2);
        }
        this.f104856e = cursor.getColumnIndexOrThrow("_id");
        this.f104852a = true;
        notifyDataSetChanged();
        return cursor2;
    }
}
