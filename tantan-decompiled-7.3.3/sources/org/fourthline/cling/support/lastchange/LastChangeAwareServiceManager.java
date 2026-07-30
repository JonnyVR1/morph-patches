package org.fourthline.cling.support.lastchange;

import java.util.ArrayList;
import java.util.Collection;
import org.fourthline.cling.model.DefaultServiceManager;
import org.fourthline.cling.model.meta.LocalService;
import org.fourthline.cling.model.meta.StateVariable;
import org.fourthline.cling.model.state.StateVariableValue;
import org.fourthline.cling.model.types.UnsignedIntegerFourBytes;
import org.fourthline.cling.support.lastchange.LastChangeDelegator;

/* JADX INFO: loaded from: classes3.dex */
public class LastChangeAwareServiceManager<T extends LastChangeDelegator> extends DefaultServiceManager<T> {
    protected final LastChangeParser lastChangeParser;

    public LastChangeAwareServiceManager(LocalService<T> localService, Class<T> cls, LastChangeParser lastChangeParser) {
        super(localService, cls);
        this.lastChangeParser = lastChangeParser;
    }

    public void fireLastChange() {
        lock();
        try {
            getImplementation().getLastChange().fire(getPropertyChangeSupport());
        } finally {
            unlock();
        }
    }

    public LastChangeParser getLastChangeParser() {
        return this.lastChangeParser;
    }

    @Override // org.fourthline.cling.model.DefaultServiceManager
    public Collection<StateVariableValue> readInitialEventedStateVariableValues() throws Exception {
        LastChange lastChange = new LastChange(getLastChangeParser());
        UnsignedIntegerFourBytes[] currentInstanceIds = getImplementation().getCurrentInstanceIds();
        if (currentInstanceIds.length > 0) {
            for (UnsignedIntegerFourBytes unsignedIntegerFourBytes : currentInstanceIds) {
                getImplementation().appendCurrentState(lastChange, unsignedIntegerFourBytes);
            }
        } else {
            getImplementation().appendCurrentState(lastChange, new UnsignedIntegerFourBytes(0L));
        }
        StateVariable<LocalService> stateVariable = getService().getStateVariable("LastChange");
        ArrayList arrayList = new ArrayList();
        arrayList.add(new StateVariableValue(stateVariable, lastChange.toString()));
        return arrayList;
    }

    public LastChangeAwareServiceManager(LocalService<T> localService, LastChangeParser lastChangeParser) {
        this(localService, null, lastChangeParser);
    }
}
