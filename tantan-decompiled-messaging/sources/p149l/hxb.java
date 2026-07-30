package p149l;

import android.database.Cursor;
import android.widget.Filter;

/* JADX INFO: loaded from: classes.dex */
public class hxb extends Filter {

    /* JADX INFO: renamed from: a */
    public InterfaceC17425a f109842a;

    /* JADX INFO: renamed from: l.hxb$a */
    public interface InterfaceC17425a {
        /* JADX INFO: renamed from: a */
        void mo123281a(Cursor cursor);

        /* JADX INFO: renamed from: b */
        Cursor mo128537b();

        /* JADX INFO: renamed from: c */
        Cursor mo123282c(CharSequence charSequence);

        CharSequence convertToString(Cursor cursor);
    }

    public hxb(InterfaceC17425a interfaceC17425a) {
        this.f109842a = interfaceC17425a;
    }

    @Override // android.widget.Filter
    public CharSequence convertResultToString(Object obj) {
        return this.f109842a.convertToString((Cursor) obj);
    }

    @Override // android.widget.Filter
    public Filter.FilterResults performFiltering(CharSequence charSequence) {
        Cursor cursorMo123282c = this.f109842a.mo123282c(charSequence);
        Filter.FilterResults filterResults = new Filter.FilterResults();
        if (cursorMo123282c != null) {
            filterResults.count = cursorMo123282c.getCount();
            filterResults.values = cursorMo123282c;
            return filterResults;
        }
        filterResults.count = 0;
        filterResults.values = null;
        return filterResults;
    }

    @Override // android.widget.Filter
    public void publishResults(CharSequence charSequence, Filter.FilterResults filterResults) {
        Cursor cursorMo128537b = this.f109842a.mo128537b();
        Object obj = filterResults.values;
        if (obj == null || obj == cursorMo128537b) {
            return;
        }
        this.f109842a.mo123281a((Cursor) obj);
    }
}
