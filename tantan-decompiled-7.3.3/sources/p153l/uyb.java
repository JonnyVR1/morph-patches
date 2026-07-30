package p153l;

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
public abstract class uyb extends BaseAdapter implements Filterable, vyb.InterfaceC20955a {

    /* JADX INFO: renamed from: a */
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public boolean f181555a;

    /* JADX INFO: renamed from: b */
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public boolean f181556b;

    /* JADX INFO: renamed from: c */
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public Cursor f181557c;

    /* JADX INFO: renamed from: d */
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public Context f181558d;

    /* JADX INFO: renamed from: e */
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public int f181559e;

    /* JADX INFO: renamed from: f */
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public C20696a f181560f;

    /* JADX INFO: renamed from: g */
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public DataSetObserver f181561g;

    /* JADX INFO: renamed from: h */
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public vyb f181562h;

    /* JADX INFO: renamed from: l.uyb$a */
    public class C20696a extends ContentObserver {
        public C20696a() {
            super(new Handler());
        }

        @Override // android.database.ContentObserver
        public boolean deliverSelfNotifications() {
            return true;
        }

        @Override // android.database.ContentObserver
        public void onChange(boolean z) {
            uyb.this.m198585h();
        }
    }

    /* JADX INFO: renamed from: l.uyb$b */
    public class C20697b extends DataSetObserver {
        public C20697b() {
        }

        @Override // android.database.DataSetObserver
        public void onChanged() {
            uyb uybVar = uyb.this;
            uybVar.f181555a = true;
            uybVar.notifyDataSetChanged();
        }

        @Override // android.database.DataSetObserver
        public void onInvalidated() {
            uyb uybVar = uyb.this;
            uybVar.f181555a = false;
            uybVar.notifyDataSetInvalidated();
        }
    }

    public uyb(Context context, Cursor cursor, boolean z) {
        m198583e(context, cursor, z ? 1 : 2);
    }

    /* JADX INFO: renamed from: a */
    public void mo161292a(Cursor cursor) {
        Cursor cursorM198586i = m198586i(cursor);
        if (cursorM198586i != null) {
            cursorM198586i.close();
        }
    }

    @Override // p153l.vyb.InterfaceC20955a
    /* JADX INFO: renamed from: b */
    public Cursor mo198582b() {
        return this.f181557c;
    }

    public abstract CharSequence convertToString(Cursor cursor);

    /* JADX INFO: renamed from: d */
    public abstract void mo161294d(View view, Context context, Cursor cursor);

    /* JADX INFO: renamed from: e */
    public void m198583e(Context context, Cursor cursor, int i) {
        if ((i & 1) == 1) {
            i |= 2;
            this.f181556b = true;
        } else {
            this.f181556b = false;
        }
        boolean z = cursor != null;
        this.f181557c = cursor;
        this.f181555a = z;
        this.f181558d = context;
        this.f181559e = z ? cursor.getColumnIndexOrThrow("_id") : -1;
        if ((i & 2) == 2) {
            this.f181560f = new C20696a();
            this.f181561g = new C20697b();
        } else {
            this.f181560f = null;
            this.f181561g = null;
        }
        if (z) {
            C20696a c20696a = this.f181560f;
            if (c20696a != null) {
                cursor.registerContentObserver(c20696a);
            }
            DataSetObserver dataSetObserver = this.f181561g;
            if (dataSetObserver != null) {
                cursor.registerDataSetObserver(dataSetObserver);
            }
        }
    }

    /* JADX INFO: renamed from: f */
    public abstract View mo198584f(Context context, Cursor cursor, ViewGroup viewGroup);

    /* JADX INFO: renamed from: g */
    public abstract View mo161295g(Context context, Cursor cursor, ViewGroup viewGroup);

    @Override // android.widget.Adapter
    public int getCount() {
        Cursor cursor;
        if (!this.f181555a || (cursor = this.f181557c) == null) {
            return 0;
        }
        return cursor.getCount();
    }

    @Override // android.widget.BaseAdapter, android.widget.SpinnerAdapter
    public View getDropDownView(int i, View view, ViewGroup viewGroup) {
        if (!this.f181555a) {
            return null;
        }
        this.f181557c.moveToPosition(i);
        if (view == null) {
            view = mo198584f(this.f181558d, this.f181557c, viewGroup);
        }
        mo161294d(view, this.f181558d, this.f181557c);
        return view;
    }

    @Override // android.widget.Filterable
    public Filter getFilter() {
        if (this.f181562h == null) {
            this.f181562h = new vyb(this);
        }
        return this.f181562h;
    }

    @Override // android.widget.Adapter
    public Object getItem(int i) {
        Cursor cursor;
        if (!this.f181555a || (cursor = this.f181557c) == null) {
            return null;
        }
        cursor.moveToPosition(i);
        return this.f181557c;
    }

    @Override // android.widget.Adapter
    public long getItemId(int i) {
        Cursor cursor;
        if (this.f181555a && (cursor = this.f181557c) != null && cursor.moveToPosition(i)) {
            return this.f181557c.getLong(this.f181559e);
        }
        return 0L;
    }

    @Override // android.widget.Adapter
    public View getView(int i, View view, ViewGroup viewGroup) {
        if (!this.f181555a) {
            wtq0.m207906a("this should only be called when the cursor is valid");
            return null;
        }
        if (!this.f181557c.moveToPosition(i)) {
            o4c.m165980a("couldn't move cursor to position ", i);
            return null;
        }
        if (view == null) {
            view = mo161295g(this.f181558d, this.f181557c, viewGroup);
        }
        mo161294d(view, this.f181558d, this.f181557c);
        return view;
    }

    /* JADX INFO: renamed from: h */
    public void m198585h() {
        Cursor cursor;
        if (!this.f181556b || (cursor = this.f181557c) == null || cursor.isClosed()) {
            return;
        }
        this.f181555a = this.f181557c.requery();
    }

    /* JADX INFO: renamed from: i */
    public Cursor m198586i(Cursor cursor) {
        Cursor cursor2 = this.f181557c;
        if (cursor == cursor2) {
            return null;
        }
        if (cursor2 != null) {
            C20696a c20696a = this.f181560f;
            if (c20696a != null) {
                cursor2.unregisterContentObserver(c20696a);
            }
            DataSetObserver dataSetObserver = this.f181561g;
            if (dataSetObserver != null) {
                cursor2.unregisterDataSetObserver(dataSetObserver);
            }
        }
        this.f181557c = cursor;
        if (cursor == null) {
            this.f181559e = -1;
            this.f181555a = false;
            notifyDataSetInvalidated();
            return cursor2;
        }
        C20696a c20696a2 = this.f181560f;
        if (c20696a2 != null) {
            cursor.registerContentObserver(c20696a2);
        }
        DataSetObserver dataSetObserver2 = this.f181561g;
        if (dataSetObserver2 != null) {
            cursor.registerDataSetObserver(dataSetObserver2);
        }
        this.f181559e = cursor.getColumnIndexOrThrow("_id");
        this.f181555a = true;
        notifyDataSetChanged();
        return cursor2;
    }
}
