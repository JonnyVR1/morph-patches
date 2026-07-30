package org.eclipse.jetty.servlet;

import com.alibaba.sdk.android.oss.signer.SignParameters;
import com.tencent.open.SocialConstants;
import java.io.IOException;
import java.util.EnumSet;
import javax.servlet.DispatcherType;
import org.eclipse.jetty.http.PathMap;
import org.eclipse.jetty.util.TypeUtil;
import org.eclipse.jetty.util.component.AggregateLifeCycle;
import org.eclipse.jetty.util.component.Dumpable;
import p149l.ig3;

/* JADX INFO: loaded from: classes3.dex */
public class FilterMapping implements Dumpable {
    public static final int ALL = 31;
    public static final int ASYNC = 16;
    public static final int DEFAULT = 0;
    public static final int ERROR = 8;
    public static final int FORWARD = 2;
    public static final int INCLUDE = 4;
    public static final int REQUEST = 1;
    private int _dispatches = 0;
    private String _filterName;
    private transient FilterHolder _holder;
    private String[] _pathSpecs;
    private String[] _servletNames;

    /* JADX INFO: renamed from: org.eclipse.jetty.servlet.FilterMapping$1 */
    public static /* synthetic */ class C219511 {
        static final /* synthetic */ int[] $SwitchMap$javax$servlet$DispatcherType;

        static {
            int[] iArr = new int[DispatcherType.values().length];
            $SwitchMap$javax$servlet$DispatcherType = iArr;
            try {
                iArr[DispatcherType.REQUEST.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$javax$servlet$DispatcherType[DispatcherType.ASYNC.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$javax$servlet$DispatcherType[DispatcherType.FORWARD.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$javax$servlet$DispatcherType[DispatcherType.INCLUDE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$javax$servlet$DispatcherType[DispatcherType.ERROR.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    public static DispatcherType dispatch(String str) {
        if (SocialConstants.TYPE_REQUEST.equalsIgnoreCase(str)) {
            return DispatcherType.REQUEST;
        }
        if ("forward".equalsIgnoreCase(str)) {
            return DispatcherType.FORWARD;
        }
        if ("include".equalsIgnoreCase(str)) {
            return DispatcherType.INCLUDE;
        }
        if ("error".equalsIgnoreCase(str)) {
            return DispatcherType.ERROR;
        }
        if ("async".equalsIgnoreCase(str)) {
            return DispatcherType.ASYNC;
        }
        ig3.m135964a(str);
        return null;
    }

    public boolean appliesTo(String str, int i) {
        if (appliesTo(i)) {
            int i2 = 0;
            while (true) {
                String[] strArr = this._pathSpecs;
                if (i2 >= strArr.length) {
                    break;
                }
                String str2 = strArr[i2];
                if (str2 != null && PathMap.match(str2, str, true)) {
                    return true;
                }
                i2++;
            }
        }
        return false;
    }

    @Override // org.eclipse.jetty.util.component.Dumpable
    public void dump(Appendable appendable, String str) throws IOException {
        appendable.append(String.valueOf(this)).append(SignParameters.NEW_LINE);
    }

    public FilterHolder getFilterHolder() {
        return this._holder;
    }

    public String getFilterName() {
        return this._filterName;
    }

    public String[] getPathSpecs() {
        return this._pathSpecs;
    }

    public String[] getServletNames() {
        return this._servletNames;
    }

    public void setDispatcherTypes(EnumSet<DispatcherType> enumSet) {
        this._dispatches = 0;
        if (enumSet != null) {
            if (enumSet.contains(DispatcherType.ERROR)) {
                this._dispatches |= 8;
            }
            if (enumSet.contains(DispatcherType.FORWARD)) {
                this._dispatches |= 2;
            }
            if (enumSet.contains(DispatcherType.INCLUDE)) {
                this._dispatches |= 4;
            }
            if (enumSet.contains(DispatcherType.REQUEST)) {
                this._dispatches |= 1;
            }
            if (enumSet.contains(DispatcherType.ASYNC)) {
                this._dispatches |= 16;
            }
        }
    }

    public void setDispatches(int i) {
        this._dispatches = i;
    }

    public void setFilterHolder(FilterHolder filterHolder) {
        this._holder = filterHolder;
        setFilterName(filterHolder.getName());
    }

    public void setFilterName(String str) {
        this._filterName = str;
    }

    public void setPathSpec(String str) {
        this._pathSpecs = new String[]{str};
    }

    public void setPathSpecs(String[] strArr) {
        this._pathSpecs = strArr;
    }

    public void setServletName(String str) {
        this._servletNames = new String[]{str};
    }

    public void setServletNames(String[] strArr) {
        this._servletNames = strArr;
    }

    public String toString() {
        return TypeUtil.asList(this._pathSpecs) + "/" + TypeUtil.asList(this._servletNames) + "==" + this._dispatches + "=>" + this._filterName;
    }

    @Override // org.eclipse.jetty.util.component.Dumpable
    public String dump() {
        return AggregateLifeCycle.dump(this);
    }

    public boolean appliesTo(int i) {
        int i2 = this._dispatches;
        if (i2 == 0) {
            return i == 1 || (i == 16 && this._holder.isAsyncSupported());
        }
        return (i2 & i) != 0;
    }

    public static int dispatch(DispatcherType dispatcherType) {
        int i = C219511.$SwitchMap$javax$servlet$DispatcherType[dispatcherType.ordinal()];
        if (i == 1) {
            return 1;
        }
        int i2 = 2;
        if (i == 2) {
            return 16;
        }
        if (i != 3) {
            i2 = 4;
            if (i != 4) {
                if (i == 5) {
                    return 8;
                }
                throw new IllegalArgumentException(dispatcherType.toString());
            }
        }
        return i2;
    }
}
