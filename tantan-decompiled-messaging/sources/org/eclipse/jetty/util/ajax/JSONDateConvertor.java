package org.eclipse.jetty.util.ajax;

import java.text.DateFormatSymbols;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import org.eclipse.jetty.util.DateCache;
import org.eclipse.jetty.util.log.Log;
import org.eclipse.jetty.util.log.Logger;
import p149l.bz00;

/* JADX INFO: loaded from: classes3.dex */
public class JSONDateConvertor implements JSON.Convertor {
    private static final Logger LOG = Log.getLogger((Class<?>) JSONDateConvertor.class);
    DateCache _dateCache;
    SimpleDateFormat _format;
    private boolean _fromJSON;

    public JSONDateConvertor(String str, TimeZone timeZone, boolean z, Locale locale) {
        DateCache dateCache = new DateCache(str, locale);
        this._dateCache = dateCache;
        dateCache.setTimeZone(timeZone);
        this._fromJSON = z;
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(str, new DateFormatSymbols(locale));
        this._format = simpleDateFormat;
        simpleDateFormat.setTimeZone(timeZone);
    }

    @Override // org.eclipse.jetty.util.ajax.JSON.Convertor
    public Object fromJSON(Map map) {
        Object object;
        if (!this._fromJSON) {
            bz00.m104536a();
            return null;
        }
        try {
            synchronized (this._format) {
                object = this._format.parseObject((String) map.get("value"));
            }
            return object;
        } catch (Exception e) {
            LOG.warn(e);
            return null;
        }
    }

    @Override // org.eclipse.jetty.util.ajax.JSON.Convertor
    public void toJSON(Object obj, JSON.Output output) {
        String str = this._dateCache.format((Date) obj);
        if (!this._fromJSON) {
            output.add(str);
        } else {
            output.addClass(obj.getClass());
            output.add("value", str);
        }
    }

    public JSONDateConvertor(boolean z) {
        this(DateCache.DEFAULT_FORMAT, TimeZone.getTimeZone("GMT"), z);
    }

    public JSONDateConvertor(String str, TimeZone timeZone, boolean z) {
        DateCache dateCache = new DateCache(str);
        this._dateCache = dateCache;
        dateCache.setTimeZone(timeZone);
        this._fromJSON = z;
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(str);
        this._format = simpleDateFormat;
        simpleDateFormat.setTimeZone(timeZone);
    }

    public JSONDateConvertor() {
        this(false);
    }
}
