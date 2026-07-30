package com.immomo.moment.filtermanager;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.text.TextUtils;
import com.alibaba.fastjson.annotation.JSONField;
import java.io.Serializable;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import p149l.h75;
import p149l.k3w;
import p149l.nkw;
import p149l.us2;
import p149l.w03;
import p149l.zhf0;

/* JADX INFO: loaded from: classes7.dex */
public class MMFilter implements Serializable {
    public static final long serialVersionUID = 8953832831202944607L;
    private transient Context context;
    public String mFilterName;
    private List<MMProcessUnit> mProcessUnits;

    public MMFilter(Context context) {
        this.mProcessUnits = new ArrayList();
        this.context = context;
    }

    public static Bitmap getBitmapByPath(String str, Context context) {
        return str.startsWith("light_room_filters") ? nkw.m160007a(str, context) : BitmapFactory.decodeFile(str);
    }

    public static List<us2> getFilterGroupByUnits(Collection<MMProcessUnit> collection, Context context) {
        ArrayList arrayList = new ArrayList();
        for (MMProcessUnit mMProcessUnit : collection) {
            if (!mMProcessUnit.isDecoration()) {
                try {
                    Class<?> cls = Class.forName(mMProcessUnit.getFilterName());
                    us2 us2Var = (us2) cls.newInstance();
                    HashMap<String, Object> filterMap = mMProcessUnit.getFilterMap();
                    if (filterMap != null) {
                        for (String str : filterMap.keySet()) {
                            cls.getDeclaredMethod(str, h75.m129620a(filterMap.get(str))).invoke(us2Var, filterMap.get(str));
                        }
                    }
                    if (mMProcessUnit.getTexturePath1() != null) {
                        if (us2Var instanceof k3w) {
                            if (mMProcessUnit.getTexturePath1().startsWith("light_room_filters")) {
                                ((k3w) us2Var).m144442U(context, mMProcessUnit.getTexturePath1());
                            } else {
                                ((k3w) us2Var).m144443V(mMProcessUnit.getTexturePath1());
                            }
                        } else if (us2Var instanceof w03) {
                            ((w03) us2Var).m200820n0(getBitmapByPath(mMProcessUnit.getTexturePath1(), context));
                        }
                    }
                    arrayList.add(us2Var);
                } catch (ClassNotFoundException e) {
                    e.printStackTrace();
                } catch (IllegalAccessException e2) {
                    e2.printStackTrace();
                } catch (InstantiationException e3) {
                    e3.printStackTrace();
                } catch (NoSuchMethodException e4) {
                    e4.printStackTrace();
                } catch (InvocationTargetException e5) {
                    e5.printStackTrace();
                }
            }
        }
        if (arrayList.size() == 0) {
            arrayList.add(new us2());
        }
        return arrayList;
    }

    @JSONField(serialize = false)
    public zhf0 getFilterGroup() {
        return new zhf0(getFilterGroupByUnits(getProcessUnits(), this.context));
    }

    public String getFilterName() {
        if (!TextUtils.isEmpty(this.mFilterName)) {
            this.mFilterName.replace(".", "_");
            String[] strArrSplit = this.mFilterName.split("_");
            if (strArrSplit.length > 1) {
                return strArrSplit[1];
            }
        }
        return this.mFilterName;
    }

    public String getKey() {
        return ".....";
    }

    public List<MMProcessUnit> getProcessUnits() {
        return this.mProcessUnits;
    }

    public void setProcessUnits(List<MMProcessUnit> list) {
        this.mProcessUnits = list;
    }

    public MMFilter() {
    }
}
