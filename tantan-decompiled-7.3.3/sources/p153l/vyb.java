package p153l;

import android.database.Cursor;
import android.widget.Filter;

/* JADX INFO: loaded from: classes.dex */
public class vyb extends Filter {

    /* JADX INFO: renamed from: a */
    public InterfaceC20955a f186350a;

    /* JADX INFO: renamed from: l.vyb$a */
    public interface InterfaceC20955a {
        /* JADX INFO: renamed from: a */
        void mo161292a(Cursor cursor);

        /* JADX INFO: renamed from: b */
        Cursor mo198582b();

        /* JADX INFO: renamed from: c */
        Cursor mo161293c(CharSequence charSequence);

        CharSequence convertToString(Cursor cursor);
    }

    public vyb(InterfaceC20955a interfaceC20955a) {
        this.f186350a = interfaceC20955a;
    }

    @Override // android.widget.Filter
    public CharSequence convertResultToString(Object obj) {
        return this.f186350a.convertToString((Cursor) obj);
    }

    @Override // android.widget.Filter
    public Filter.FilterResults performFiltering(CharSequence charSequence) {
        Cursor cursorMo161293c = this.f186350a.mo161293c(charSequence);
        Filter.FilterResults filterResults = new Filter.FilterResults();
        if (cursorMo161293c != null) {
            filterResults.count = cursorMo161293c.getCount();
            filterResults.values = cursorMo161293c;
            return filterResults;
        }
        filterResults.count = 0;
        filterResults.values = null;
        return filterResults;
    }

    @Override // android.widget.Filter
    public void publishResults(CharSequence charSequence, Filter.FilterResults filterResults) {
        Cursor cursorMo198582b = this.f186350a.mo198582b();
        Object obj = filterResults.values;
        if (obj == null || obj == cursorMo198582b) {
            return;
        }
        this.f186350a.mo161292a((Cursor) obj);
    }
}
