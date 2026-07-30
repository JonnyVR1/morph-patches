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
import p153l.i5w;
import p153l.i85;
import p153l.iqf0;
import p153l.kt2;
import p153l.l13;
import p153l.mnw;

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
        return str.startsWith("light_room_filters") ? mnw.m159206a(str, context) : BitmapFactory.decodeFile(str);
    }

    public static List<kt2> getFilterGroupByUnits(Collection<MMProcessUnit> collection, Context context) {
        ArrayList arrayList = new ArrayList();
        for (MMProcessUnit mMProcessUnit : collection) {
            if (!mMProcessUnit.isDecoration()) {
                try {
                    Class<?> cls = Class.forName(mMProcessUnit.getFilterName());
                    kt2 kt2Var = (kt2) cls.newInstance();
                    HashMap<String, Object> filterMap = mMProcessUnit.getFilterMap();
                    if (filterMap != null) {
                        for (String str : filterMap.keySet()) {
                            cls.getDeclaredMethod(str, i85.m138994a(filterMap.get(str))).invoke(kt2Var, filterMap.get(str));
                        }
                    }
                    if (mMProcessUnit.getTexturePath1() != null) {
                        if (kt2Var instanceof i5w) {
                            if (mMProcessUnit.getTexturePath1().startsWith("light_room_filters")) {
                                ((i5w) kt2Var).m138779U(context, mMProcessUnit.getTexturePath1());
                            } else {
                                ((i5w) kt2Var).m138780V(mMProcessUnit.getTexturePath1());
                            }
                        } else if (kt2Var instanceof l13) {
                            ((l13) kt2Var).m152455n0(getBitmapByPath(mMProcessUnit.getTexturePath1(), context));
                        }
                    }
                    arrayList.add(kt2Var);
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
            arrayList.add(new kt2());
        }
        return arrayList;
    }

    @JSONField(serialize = false)
    public iqf0 getFilterGroup() {
        return new iqf0(getFilterGroupByUnits(getProcessUnits(), this.context));
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
