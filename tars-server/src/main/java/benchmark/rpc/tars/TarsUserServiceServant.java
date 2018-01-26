// **********************************************************************
// This file was generated by a TARS parser!
// TARS version 1.0.1.
// **********************************************************************

package benchmark.rpc.tars;

import com.qq.tars.protocol.annotation.*;
import com.qq.tars.protocol.tars.annotation.*;
import com.qq.tars.common.support.Holder;

@Servant
public interface TarsUserServiceServant {

	public boolean existUser(String email);

	public boolean createUser(TarsUser user);

	public TarsUser getUser(long id);

	public TarsPage listUser(int pageNo);
}